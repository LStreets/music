<template>
    <div class="table">
        <div class="crumbs">
            <i class="el-icon-tickets"></i>评论信息
        </div>
        <div class="container">
            <div class="handle-box">
                <el-button type="primary" size="mini" @click="delAll">批量删除</el-button>
                <el-input v-model="select_word" size="mini" placeholder="筛选关键词" class="handle-input"></el-input>
            </div>
        </div>
        <el-table size="mini" ref="multipleTable" border style="width:100%" height="680px" :data="tableData" @selection-change="handleSelectionChange">
            <el-table-column type="selection" width="40"></el-table-column>            
            <el-table-column prop="name" label="用户名" align="center"></el-table-column>   
            <el-table-column prop="content" label="评论内容" align="center"></el-table-column>           
            <el-table-column label="操作" width="150" align="center">
                <template slot-scope="scope">
                    <el-button size="mini" type="danger" @click="handleDelete(scope.row)">删除</el-button> 
                </template>
            </el-table-column>
        </el-table>
        
        <el-dialog title="删除评论" :visible.sync="delVisible" width="300px" center>
            <div align="center">删除不可恢复，是否确定删除？</div>
            <span slot="footer">
                <el-button size="mini" @click="delVisible = false">取消</el-button>
                <el-button size="mini" @click="deleteRow">确定</el-button>                
            </span>
        </el-dialog>
    </div>
</template>

<script>
import { mixin } from '../mixins/index';
import {getUserOfId,getCommentOfSongListId,deleteComment} from '../api/index';

export default {
    mixins: [mixin],
    props: ['id'],
    data(){
        return{
            delVisible: false,          //删除弹窗是否显示
            tableData: [],
            tempData: [],
            select_word: '',
            idx: -1,          //当前选择项
            multipleSelection: [],   //哪些项已经打勾
        }
    },
    watch:{
        //搜索框里面的内容发生变化的时候，搜索结果table列表的内容跟着它的内容发生变化
        select_word: function(){
            if(this.select_word == ''){
                this.tableData = this.tempData;
            }else{
                this.tableData = [];
                for(let item of this.tempData){
                    if(item.name.includes(this.select_word)){
                        this.tableData.push(item);
                    }
                }
            }
        }
    },
    created(){
        this.getData();
    },
    methods:{
        //查询指定歌单的评论列表
        getData(){
            this.tempData = [];
            this.tableData = [];
            getCommentOfSongListId(this.$route.query.id).then(res => {
                for(let item of res){
                    this.getUsers(item.userId,item);
                }
            })
        },
        //获取用户名，连同本对象放到tempData和tableData里面
        getUsers(id,item){
            getUserOfId(id)
            .then(res => {
                let o = item;
                o.name = res.username;
                this.tempData.push(o);
                this.tableData.push(o);
            })
            .catch(err => {
                console.log(err);
            });
        },
        //删除一条评论
        deleteRow(){
            deleteComment(this.idx.id)
            .then(res => {
                if(res){
                    this.getData();
                    this.notify("删除成功","success");
                }else{
                    this.notify("删除失败","error");
                }
            })
            .catch(err => {
                console.log(err);
            });
            this.delVisible = false;
        },
        //批量删除已经选择的项
        delAll(){
            for(let item of this.multipleSelection){
                this.handleDelete(item);
                this.deleteRow();
            }
            this.multipleSelection = [];
        }
    }   
}
</script>

<style scoped>
    .handle-box{
        margin-bottom: 20px;
    }
    .handle-input{
        width: 300px;
        display: inline-block;
    }
</style>
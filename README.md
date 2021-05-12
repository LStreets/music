# music
springboot+vue音乐网站
个人学习前后端分离项目
文件说明：
 - 前端
前台  music-client
后台  music-manage
 - 后端 music-server
# 系统环境配置
 - 系统开发平台：JDK1.8+Window 10+Maven3.6.1
 - 开发语言：JavaEE+vue2.x
 - 后台框架：Springboot2.x
 - 前端：Vue2.9.6
 - 数据库和工具:MySql5.7 Navicat
 - 开发工具：Intellij Idea VSCode
 - 浏览器：Chrome

# 技术栈

 - 前端技术栈

1.Vue.js
2.ElementUI
3.axios

 - 后端技术栈

1.Spring Boot
2.mybatis
3.lombok

 - 数据库

1.MySQL

 - 数据库表字段
 
 - 管理员表（admin）:管理员id、账号、密码
 - 收藏表（collect）：收藏id、用户id、收藏类型（0歌曲，1歌单）、歌曲id、歌单id、收藏时间
 - 评论表（comment）：评论id、用户id、歌曲id、歌单id、评论类型（0歌曲，1歌单）、评论内容、评论时间、评论点赞数
 - 用户表（consumer）：用户id、账号、密码、性别、手机号码、电子邮箱、生日、签名、所属地区、头像、创建时间、更新时间
 - 歌单歌曲表（list_song）：id、歌曲id、歌单id
 - 评价表（rank）：评价id、歌单id、用户id、评分
 - 歌手表（singer）：歌手id、名字、性别、头像、生日、地区、简介
 - 歌曲表（song）：歌曲id、歌手id、歌曲名字（歌手名-歌曲名）、简介、创建时间、更新时间、图片、歌词、歌曲地址
 - 歌单表（song_list）：歌单id、歌单标题、歌单图片、简介、风格
 

# 项目演示

## 前台

 - 首页
![](https://img-blog.csdnimg.cn/20210510144440647.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)
 - 歌单
 ![](https://img-blog.csdnimg.cn/20210510145029523.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 歌手
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145124528.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 我的音乐
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145317950.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 播放界面
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145343864.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

## 后台

 - 系统首页

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145409817.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 用户管理
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145719980.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 歌手管理
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145824659.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

 - 歌单管理
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210510145848911.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NTE1ODM5Nw==,size_16,color_FFFFFF,t_70)

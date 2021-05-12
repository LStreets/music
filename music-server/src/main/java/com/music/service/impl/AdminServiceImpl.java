package com.music.service.impl;

import com.music.dao.AdminMapper;
import com.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员service实现类
 * @author laojie
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 验证密码是否正确
     * @param username
     * @param password
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        //大于0返回true,不大于0返回false
        return adminMapper.verifyPassword(username, password)>0;
    }
}

package com.music.service;

/**
 * @author laojie
 * 管理员接口
 */
public interface AdminService {
    /**
     * 验证密码是否正确
     */
    public boolean verifyPassword(String username,String password);
}

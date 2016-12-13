/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.service.impl;
import mvc.entity.User;
import mvc.mapper.UserMapper;
import mvc.service.LoginService;

/**
 *
 * @author lengzq
 */
public class LoginServiceImpl implements LoginService{
    private  UserMapper userMapper;
    
    @Override
    public boolean login(User user) {
        boolean result = false;
        try {
            int activeLines = userMapper.login(user);
            if(activeLines>0){
                result = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * @return the userMapper
     */
    public UserMapper getUserMapper() {
        return userMapper;
    }

    /**
     * @param userMapper the userMapper to set
     */
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
}

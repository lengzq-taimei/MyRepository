/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.action;

import mvc.entity.User;
import mvc.service.LoginService;

/**
 *
 * @author lengzq
 */
public class LoginAction {
    private String username;
    private String password;
    private LoginService loginService;
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * validate account infomation
     * @return 
     */
    public String login(){
        String result = "";
        try{
            User user = new User(username,password);
            boolean backResult = loginService.login(user);
            if(backResult){
                result = "登录成功";
            }else{
                result = "登录失败";
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return result;
    }

    /**
     * @return the loginService
     */
    public LoginService getLoginService() {
        return loginService;
    }

    /**
     * @param loginService the loginService to set
     */
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}

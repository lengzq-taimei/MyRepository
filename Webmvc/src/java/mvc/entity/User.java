/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lengzq
 */
@Entity
public class User implements Serializable {

    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String userPwd;
    private String userAddr;
    private String userSex;
    private String userPhone;
    private String userEmail;
    private int userAge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd the userPwd to set
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public User(Long id, String userName, String userPwd, String userAddr, String userSex, String userPhone, String userEmail, int userAge) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userAddr = userAddr;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userAge = userAge;
    }

    /**
     * @return the userAddr
     */
    public String getUserAddr() {
        return userAddr;
    }

    /**
     * @param userAddr the userAddr to set
     */
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    /**
     * @return the userSex
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * @param userSex the userSex to set
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * @return the userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone the userPhone to set
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the userAge
     */
    public int getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the userAge to set
     */
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", userAddr=" + userAddr + ", userSex=" + userSex + ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userAge=" + userAge + '}';
    }
}

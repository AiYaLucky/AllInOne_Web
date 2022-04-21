package com.allinone.view;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/21 10:30
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
public class RegisterVo {
    private String account;
    private String password;
    private String nickName;
    private String email;

    public RegisterVo() {
    }

    public RegisterVo(String account, String password, String nickName, String email) {
        this.account = account;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

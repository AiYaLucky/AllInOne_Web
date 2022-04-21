package com.allinone.view;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/21 10:42
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
public class LoginVo {
    private String account;
    private String password;

    public LoginVo() {
    }

    public LoginVo(String account, String password) {
        this.account = account;
        this.password = password;
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

    @Override
    public String toString() {
        return "LoginVo{" + "account='" + account + '\'' + ", password='" + password + '\'' + '}';
    }
}

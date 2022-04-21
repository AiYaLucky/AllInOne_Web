package com.allinone.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体类
 *
 * @TableName user
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户最后一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    public String getId() {
        return id;
    }

    /**
     * 用户id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 用户账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 用户最后一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 用户最后一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
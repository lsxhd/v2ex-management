package com.v2ex.management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String passwd;
    private String email;
    private String telphone;
    private String avatar;
    private Timestamp date;

    private List<Permissions> permissions;

    public User(int id, String name, String passwd, String email, String telphone, String avatar, java.sql.Timestamp date) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.email = email;
        this.telphone = telphone;
        this.avatar = avatar;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8",locale = "zh")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }
}

package com.v2ex.management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Reply {
    private int id;
    private int tid;
    private String content;
    private java.sql.Timestamp date;
    private int uid;

    private Theme theme;//帖子的实例化
    private User user;//用户的实例化

    public Reply(int id, int tid, String content, java.sql.Timestamp date, int uid) {
        this.id = id;
        this.tid = tid;
        this.content = content;
        this.date = date;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8",locale = "zh")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

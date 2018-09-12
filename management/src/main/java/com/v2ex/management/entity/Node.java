package com.v2ex.management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Node {
    private int id;
    private String pid;
    private String content;
    private String url;
    private Timestamp date;
    private String avatar;
    private int click;

    public Node(int id, String pid, String content, String url, Timestamp date, String avatar, int click) {
        this.id = id;
        this.pid = pid;
        this.content = content;
        this.url = url;
        this.date = date;
        this.avatar = avatar;
        this.click = click;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8",locale = "zh")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }


}

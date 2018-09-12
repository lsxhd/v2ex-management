package com.v2ex.management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Theme {
    private int id;
    private String title;
    private int author;
    private User user;//用户的实例化
    private String content;
    private java.sql.Timestamp date;
    private int tag;
    private Node node;//节点的实例化
    private int collect;
    private int thanks;
    private int click;
    private int good;
    private int top;

    public Theme(int id, String title, int author, String content, java.sql.Timestamp date, int tag, int collect, int thanks, int click, int good, int top) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
        this.tag = tag;
        this.collect = collect;
        this.thanks = thanks;
        this.click = click;
        this.good = good;
        this.top = top;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8",locale = "zh")
    public java.sql.Timestamp getDate() {
        return date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public int getThanks() {
        return thanks;
    }

    public void setThanks(int thanks) {
        this.thanks = thanks;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", tag=" + tag +
                ", collect=" + collect +
                ", thanks=" + thanks +
                ", click=" + click +
                ", good=" + good +
                ", top=" + top +
                '}';
    }
}

package com.v2ex.management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Tag {
    private int id;
    private int tid;
    private String content;
    private java.sql.Timestamp date;
    private int tag;
    private int collect;
    private int thanks;
    private int click;

    public Tag(int id, int tid, String content, java.sql.Timestamp date, int tag, int collect, int thanks, int click) {
        this.id = id;
        this.tid = tid;
        this.content = content;
        this.date = date;
        this.tag = tag;
        this.collect = collect;
        this.thanks = thanks;
        this.click = click;
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
}

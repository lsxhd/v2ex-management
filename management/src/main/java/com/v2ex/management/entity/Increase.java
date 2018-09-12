package com.v2ex.management.entity;

import java.sql.Timestamp;

public class Increase {
    private  int id;
    private  int tid;
    private  String content;
    private  Timestamp time;

    public Increase(int id, int tid, String content, Timestamp time) {
        this.id = id;
        this.tid = tid;
        this.content = content;
        this.time = time;
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

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}

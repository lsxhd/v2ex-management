package com.v2ex.management.entity;

public class Verification {
    private int id;
    private String url;
    private String answer;

    public Verification(int id, String url, String answer) {
        this.id = id;
        this.url = url;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

package com.v2ex.management.entity;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 10:25
 * @Description:
 */
public class Permissions {
    private int id;
    private int user;
    private int node;

    public Permissions(int id, int user, int node) {
        this.id = id;
        this.user = user;
        this.node = node;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }
}

package com.atguigu.gmall.user.request;

import java.io.Serializable;

public class RequestId implements Serializable{
    public Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RequestId{" +
                "id=" + id +
                '}';
    }
}

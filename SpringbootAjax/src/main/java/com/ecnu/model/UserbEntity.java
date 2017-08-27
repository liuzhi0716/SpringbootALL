package com.ecnu.model;

import java.io.Serializable;

/**
 * Created by 63050 on 2017/8/23.
 */
public class UserbEntity implements Serializable{

    private Integer id;
    private String wxid;
    private String name;
    private String scid;

    //头像，类型未定
    //private String avatar;

    public UserbEntity(){}
    public UserbEntity(String wxid, String name, String scid) {
        this.wxid = wxid;
        this.name = name;
        this.scid = scid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }
}

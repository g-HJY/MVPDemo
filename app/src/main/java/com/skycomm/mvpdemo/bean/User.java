package com.skycomm.mvpdemo.bean;

import java.io.Serializable;

/**
 * Created by _H_JY on 2017/2/28.
 */
public class User implements Serializable {

    private String pid;

    private String rid;

    private String account;

    private String password;

    private String name;

    private String sex;

    private String lng;

    private String lat;

    private String photourl;

    private String emotion;

    private String age;

    private String school;

    private String telephone;

    private String createtime;

    private String remarkname;

    private String shared;

    private String updatetime;

    private String showname;

    private String id; //成员表用户主键id

    private String sharedto; //自己给对方赋予的好友共享权限（0代表好友共享权限关闭1代表好友共享权限开启）
    private String sharedfrom; //对方给自己赋予的好友共享权限（0代表好友共享权限关闭1代表好友共享权限开启）

    public User(String pid, String account, String password, String name, String sex, String lng, String lat, String photourl, String emotion, String age, String school, String telephone, String createtime) {
        this.pid = pid;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.lng = lng;
        this.lat = lat;
        this.photourl = photourl;
        this.emotion = emotion;
        this.age = age;
        this.school = school;
        this.telephone = telephone;
        this.createtime = createtime;
    }

    public User(String pid, String rid, String account, String password, String name, String sex, String lng, String lat, String photourl, String emotion, String age, String school, String telephone, String createtime, String remarkname) {
        this.pid = pid;
        this.rid = rid;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.lng = lng;
        this.lat = lat;
        this.photourl = photourl;
        this.emotion = emotion;
        this.age = age;
        this.school = school;
        this.telephone = telephone;
        this.createtime = createtime;
        this.remarkname = remarkname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRemarkname() {
        return remarkname;
    }

    public void setRemarkname(String remarkname) {
        this.remarkname = remarkname;
    }

    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getSharedto() {
        return sharedto;
    }

    public void setSharedto(String sharedto) {
        this.sharedto = sharedto;
    }

    public String getSharedfrom() {
        return sharedfrom;
    }

    public void setSharedfrom(String sharedfrom) {
        this.sharedfrom = sharedfrom;
    }

    @Override
    public String toString() {
        return "User{" +
                "pid='" + pid + '\'' +
                ", rid='" + rid + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", photourl='" + photourl + '\'' +
                ", emotion='" + emotion + '\'' +
                ", age='" + age + '\'' +
                ", school='" + school + '\'' +
                ", telephone='" + telephone + '\'' +
                ", createtime='" + createtime + '\'' +
                ", remarkname='" + remarkname + '\'' +
                ", shared='" + shared + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", showname='" + showname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

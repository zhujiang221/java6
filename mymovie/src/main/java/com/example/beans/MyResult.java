package com.example.beans;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class MyResult {
    private  int cateid;
    private  String catename;
    private List<MyFilm> myresults;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public MyResult() {
    }

    public MyResult(int cateid, String catename, List<MyFilm> myresults) {
        this.cateid = cateid;
        this.catename = catename;
        this.myresults = myresults;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public List<MyFilm> getMyresults() {
        return myresults;
    }

    public void setMyresults(List<MyFilm> myresults) {
        this.myresults = myresults;
    }
}

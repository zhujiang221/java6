package com.example.service;

import com.example.beans.MyFilm;

import java.util.List;

public interface MyCollectInterface {
    //增
    public List<MyFilm> addcollect(String username,MyFilm myFilm);
    //删
    public List<MyFilm> delcollect(String username,int delInndex);
    //改
    public  List<MyFilm> updatecollect(String username,MyFilm myFilm);
    //查询
    public List<MyFilm> findcollect(String username);


}

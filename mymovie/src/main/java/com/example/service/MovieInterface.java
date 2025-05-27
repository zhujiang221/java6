package com.example.service;

import com.example.beans.Movied;

import java.util.List;

/*
电影的接口
只有没有实现的方法
 */
public interface MovieInterface {
    //商品的增
    public  void  add();
    //商品的删
    public void delete();
    //商品的改
    public void update();
    //商品的查
    public List<Movied> search();




}

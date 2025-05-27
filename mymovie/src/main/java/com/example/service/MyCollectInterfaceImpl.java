package com.example.service;

import com.example.beans.MyFilm;
import com.example.utils.MyCollectManager;


import java.util.List;

public class  MyCollectInterfaceImpl implements MyCollectInterface{

    @Override
    public List<MyFilm> addcollect(String username, MyFilm myFilm) {
        return MyCollectManager.addcollect(myFilm,username);
    }

    @Override
    public List<MyFilm> delcollect(String username, int delInndex) {
        return MyCollectManager.deleteMycollect(username,delInndex);
    }

    @Override
    public List<MyFilm> updatecollect(String username, MyFilm myFilm) {
        return MyCollectManager.updateMycollect(myFilm,username);
    }

    @Override
    public List<MyFilm> findcollect(String username) {
        return MyCollectManager.findMycollect(username);
    }

}

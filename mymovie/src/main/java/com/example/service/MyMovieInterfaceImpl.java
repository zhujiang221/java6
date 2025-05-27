package com.example.service;

import com.example.beans.Movied;
import com.example.beans.MyFilm;
import com.example.beans.MyMovieCategory;
import com.example.utils.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MyMovieInterfaceImpl implements MyMovieInterface{

    @Override
    public List<MyMovieCategory> findAllMovie() {
        return MyMovieJDBCUtils.myConnextDatabase();
    }

    @Override
    public boolean addMovie(MyFilm myFilm) {

        return MyMovieInsertUtils.myConnextDatabase(myFilm);
    }

    @Override
    public boolean delMovie(int id) {
        return MyMovieDeleteUtils.myConnextDatabase(id);
    }

    @Override
    public boolean modiMovie(MyFilm myFilm) {
        return MyMovieUpdateUtils.myConnextDatabase(myFilm);
    }

    @Override
    public MyFilm findMovieById(int id) {
        return MyMovieOneJDBCUtils.myConnextDatabase(id);
    }

    @Override
    public List<MyFilm> findMovie() {
        return MyMovieNewJDBCUtils.myConnextDatabase();
    }

    @Override
    public List<MyFilm> findonemovies(String myFilm) {
        return MyMovieOnenameJDBCUtils.myConnextDatabase(myFilm);
    }

    @Override
    public List<MyFilm> findallMovieIndex() {
        return MyMovieIndexNewJDBCUtils.myConnextDatabase();
    }
}

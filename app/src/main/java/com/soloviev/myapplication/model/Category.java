package com.soloviev.myapplication.model;

public class Category {

    int id;
    String title;

    //конструктор
    public Category(int id,String title){
        this.id = id;
        this.title = title;
    }

    // методы

    public int getId(){
        return  id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}

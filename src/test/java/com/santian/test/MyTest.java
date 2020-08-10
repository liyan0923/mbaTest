package com.santian.test;

import java.util.ArrayList;

public class MyTest {
    private String my_name;
    



    public MyTest(){
        System.out.println("Hi");
    }
    public MyTest(String name){
        my_name=name;
    }
    void getMy_name(String name3){
        my_name=name3;

    }
    void sayMyName(){
        System.out.println("hello "+my_name+" !!!");
    }



}


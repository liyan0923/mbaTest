package com.santian.test;

import java.util.ArrayList;

public class Player {
    static int playerCount = 0;
    private String name;
    private ArrayList list=new ArrayList();;




    public static final double PAI=3.141592657;
    {
        System.out.println("哭。。。。");

        System.out.println();
    }
    public Player(){
        System.out.println("无参数构造");
    }

    public Player(String n) {
        name = n;
        playerCount++;
        System.out.println("My name is " + name);

    }
    void sayPlayerName(){
        System.out.println("我的名字是"+name);
        System.out.println(String.format("我的数字%4.3f,第二个数字%<.1f,第三个数组%<f",2.123245));


        list.add("123");
        list.add(1);



        System.out.println(list.get(1));
    }



}

class PlayerTestDrive {
    public static void main(String[] args) {
//        System.out.println(Player.playerCount);
//        Player one = new Player("Tiger");
//        Player two = new Player("Jason");
//        System.out.println(Player.playerCount);
//        System.out.println(Player.PAI);
//        one.sayPlayerName();
        Player three=new Player("wahaha");
        three.sayPlayerName();


    }
}
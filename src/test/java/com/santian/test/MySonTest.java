package com.santian.test;

public class MySonTest extends MyTest{
        String nickname;

        public MySonTest(String name1){

            super(name1);
        }

}
class MySonTestDrive{

    public static void main(String[] args) {
        MySonTest one=new MySonTest("lily");
        one.sayMyName();
        one.nickname="lo";
        System.out.println(one.nickname);
        MyTest two=new MyTest();
        two.getMy_name("hong");
        two.sayMyName();
        Player three =new Player("liyan");
        System.out.println(Player.playerCount);
    }
}


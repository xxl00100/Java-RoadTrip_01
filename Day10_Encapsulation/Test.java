package com.Day10_Encapsulation;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/30 - 06 - 30 - 1:00
 * @Description: com.Day10_Encapsulation
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Girl g=new Girl();
        //System.out.println(g.age);已被封装,无法直接获取

        //通过set设置和get进行获取
//        System.out.println(g.setAge(35)); //错误原因:age被封装

        g.setAge(35);
        System.out.println(g.getAge());

        g.setAge(25);
        System.out.println(g.getAge());

    }
}

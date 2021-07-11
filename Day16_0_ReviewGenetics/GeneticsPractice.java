package com.Day16_0_ReviewGenetics;

import java.util.ArrayList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 13:18
 * @Description: com.Day16_0_ReviewGenetics
 * @version: 1.0
 */
public class GeneticsPractice {
    //练习使用泛型，
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //创建了一个只能够放入Integer类型的集合
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(25);
        list1.add(30);
        list1.add(40);
        list1.add(56);
/*//        list1.add("abc");  取消本行注释，立马报错，这就是泛型的应用
        list1.add(9.8);*/
        //...,,,..;;;:::""';;;'''';;'',.,.,.,.,.///
        //使用增强for循环打印这个集合
        for(Object o:list1){
            System.out.println(o);
        }

    }

}

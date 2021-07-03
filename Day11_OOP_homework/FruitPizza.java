package com.Day11_OOP_homework;


import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/3 - 07 - 03 - 21:50
 * @Description: com.Day11_OOP_homework
 * @version: 1.0
 */
public class FruitPizza extends  Pizza{

    @Override
    public void setSpecial() {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入您想添加的水果：");
        String special02=sc.next();
        System.out.println("您选择的配料为："+special02);

    }


}

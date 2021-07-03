package com.Day11_OOP_homework;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/3 - 07 - 03 - 21:06
 * @Description: com.Day11_OOP_homework
 * @version: 1.0
 *
 * 定义披萨类，拥有三个属性名称，价格，大小
 * 拥有一个方法展示这三个属性；再来一个方法展示克数和配料
 */
public  abstract class Pizza {
    private String name;
    private  double price;
    private int size;
//    private static String Special;
    //上面定义4个属性，下面定义获取方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//    public String getSpecial() {
//        return Special;
//    }
//
//    public void setSpecial(String special) {
//        Special = special;
//    }

    //上面完成属性的定义， 下面开始定义方法
//    先来一个空参构造器避免错误
    public Pizza(){

    }
//在提供一个三个参数的构造器
    public Pizza(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    //下面开始定义展示方法,子类都可以使用，无需重写
    public void showNature(){
        System.out.println("您的订单为：");
        System.out.println("名称："+this.name);
        System.out.println("价格："+this.price);
        System.out.println("大小："+this.size);
//        System.out.println(this.Special);



    }

//提供一个setPizza方法，用于制定属性
    public void setPizzaNature(String input01){
       Scanner sc=new Scanner(System.in);
        /*System.out.print("请输入披萨的名称：培根披萨 Or 水果披萨");*/
        if ("1".equals(input01)) {
            this.name = "培根披萨";
        }
        else{
            this.name = "水果披萨";
        }
        System.out.print("请输入披萨的大小:");
        this.size=sc.nextInt();
        System.out.print("请输入披萨的价格:");
        this.price =sc.nextDouble();

    }

public  abstract  void setSpecial();











}

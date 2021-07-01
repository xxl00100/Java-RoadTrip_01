package com.Day11_MethodOverrides;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 2:39
 * @Description: com.Day11_Inheritance
 * @version: 1.0
 * y这是一个父类,用于被别人继承
 */
public class Human {
    //定义三个属性
    private int age;
    private String name;
    private double height;
    //并提供他们的set和get方法


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //定义三个方法,
    public void eat(){
        System.out.println("我能进行吃饭----------");
    }
    public void sleep(){
        System.out.println("我能睡觉----------");
    }
    public void walk(){
        System.out.println("我能双腿走路-----------");
    }
    //定义一个空参构造器避免出错
    public Human(){

    }
}

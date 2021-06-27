package com.msb2;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/28 - 06 - 28 - 2:38
 * @Description: com.msb2
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口


    public static void main(String[] args) {
        //创建一个Person类的具体对象
        //第一次遇到类时,需要加载类,且只加载一次
        //创建对象,并在堆中开辟空间
        //为对象的属性进行初始化
        System.out.println("sdfsd");
        Person p=new Person();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.height);

        Person p1=new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);


        //调用重载的3个参数的构造器;
        Person p2=new Person("Mike",23,1.78);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);

        //调用重载的2个参数的构造器
        Person p3=new Person("Bob",28);
        System.out.println(p3.name);
        System.out.println(p3.age);

    }




}

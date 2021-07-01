package com.Day11_MethodOverrides;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 3:04
 * @Description: com.Day11_Inheritance
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //先创建一个对象
        Student s1= new Student();
        System.out.println(s1.super.age);

        //开始调用重写的方法
        s1.eat();
        //设置他继承的属性
        s1.setAge(23);
        s1.setName("Mike");
        s1.setHeight(1.88);
        //获取她继承的属性
        System.out.println("我的名字是"+s1.getName()+",我的年龄是"+s1.getAge()+",我的身高是:"+s1.getHeight());
        System.out.println("我开始调用继承的方法");
        s1.eat();
        s1.sleep();
        s1.walk();
        System.out.println("我开始设置并访问我特有的学号");
        s1.setSno(120130556);
        System.out.println("我的学号是:"+s1.getSno());
        System.out.println("我开始调用我独特的方法");
        s1.study();








    }
}

package com.Day11_inheritance;

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
        Student s= new Student();
        //设置他继承的属性
        s.setAge(23);
        s.setName("Mike");
        s.setHeight(1.88);
        //获取她继承的属性
        System.out.println("我的名字是"+s.getName()+",我的年龄是"+s.getAge()+",我的身高是:"+s.getHeight());
        System.out.println("我开始调用继承的方法");
        s.eat();
        s.sleep();
        s.walk();
        System.out.println("我开始设置并访问我特有的学号");
        s.setSno(120130556);
        System.out.println("我的学号是:"+s.getSno());
        System.out.println("我开始调用我独特的方法");
        s.study();








    }
}

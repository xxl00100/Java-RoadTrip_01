package com.Day11_polymorphism01;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 17:16
 * @Description: com.Day11_polymorphism01
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Girl girl=new Girl();
        Dog d=new Dog();
        Cat c=new Cat();
        Pig p=new Pig();
//下面就是多态的暂时,一个行为,不同的子类表现出来不同的形式
        Animal an=d;
        girl.play(an);
        an=c;
        girl.play(an);
        an=p;
        girl.play(an);

    }





}

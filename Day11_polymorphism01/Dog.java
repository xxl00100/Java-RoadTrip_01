package com.Day11_polymorphism01;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 17:10
 * @Description: com.Day11_polymorphism01
 * @version: 1.0
 */
public class Dog extends Animal {
    public void shout(){
        //重写父类的方法
        System.out.println("我是小狗,我的叫声是汪汪汪汪汪...");
    }
}

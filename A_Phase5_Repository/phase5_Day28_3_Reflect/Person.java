package com.phase5_Day28_3_Reflect;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 22:56
 * @Description: com.phase5_Day28_3_Reflect
 * @version: 1.0
 */
public class Person implements Serializable {
    private int age;
    public String name;

    public void eat(){
        System.out.println("eat.........");
    }

    public void sleep(){
        System.out.println("sleep.........");
    }



}

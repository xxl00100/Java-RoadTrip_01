package com.phase5_Day28_2_Reflect;

import java.lang.reflect.Method;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 22:07
 * @Description: com.phase5_Day28_2_Reflect
 * @version: 1.0
 * 真正使用反射
 */
public class Reflect_2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws Exception{
        String str = "com.phase5_Day28_2_Reflect.BankCard";  //全先定路径..
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);


    }
}



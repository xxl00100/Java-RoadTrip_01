package com.Day14_1_PracticeMathAndString;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/7 - 07 - 07 - 20:57
 * @Description: com.Day14_1_PracticeMathAndString
 * @version: 1.0
 */
public class PracticeMath {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        System.out.println("随机数："+Math.random());
        System.out.println("绝对值-95.6："+Math.abs(-95.6));
        System.out.println("向上取值95.1："+Math.ceil(95.1));
        System.out.println("向下取值95.1:"+Math.round(95.1));
        System.out.println("四舍五入95.4:"+Math.round(95.4));
        System.out.println("四舍五入95.5:"+Math.round(95.5));
        System.out.println("四舍五入95.6:"+Math.floor(95.6));
        System.out.println("最大值 6 3:"+Math.max(6,3));
        System.out.println("最大值 6 3:"+Math.min(6,3));
    }

}

package com.Day14_1_PracticeMathAndString;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/7 - 07 - 07 - 22:22
 * @Description: com.Day14_1_PracticeMathAndString
 * @version: 1.0
 */
public class StringBuilderPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder(6);
        StringBuilder sb2=new StringBuilder("abcdef");
        sb2.append("6666");
        System.out.println(sb2);
        System.out.println(sb.append("666").append("777").append("oooiiiippp"));

    }
}

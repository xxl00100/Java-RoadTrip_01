package com.Day14_1_PracticeMathAndString;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/7 - 07 - 07 - 22:22
 * @Description: com.Day14_1_PracticeMathAndString
 * @version: 1.0
 * //练习使用常用方法
 */
public class StringBufferPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        StringBuilder sb4=new StringBuilder();
        sb.append("Today I have a dream");
        sb1.append("Today I have a dream");
        sb2.append("Today I have a dream");
        sb3.append("Today I have a dream");
        sb4.append("Today I have a dream");
        System.out.println(sb);
        System.out.println(sb1.delete(2,6));
        System.out.println(sb2.deleteCharAt(13));
        System.out.println(sb3.insert(13,"Mike"));
        System.out.println(sb4.replace(3,6,"冲冲冲"));

    }
}

package com.Day14_1_PracticeMathAndString;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/7 - 07 - 07 - 21:04
 * @Description: com.Day14_1_PracticeMathAndString
 * @version: 1.0
 */
public class PracticeRandom {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        String s1="abc";
        String s2="cbc";
        System.out.println(s1.compareTo(s2));
        String s3="a";
        String s4="c";
        System.out.println(s3.compareTo(s4));
        String s5="abcdefgh";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(3,5));
        System.out.println(s5.concat(s4));
        String s6="aabcdfafafafeetu";
        System.out.println(s6.replace("a", "O"));
        String s7="A-B-D-C-F-G";
        System.out.println(s7.split(
                "-"));
        System.out.println(s7.split("-").toString());

    }
}

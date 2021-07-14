package com.Day17_1_SetPractice;

import java.util.HashSet;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 8:39
 * @Description: com.Day17_1_SetPractice
 * @version: 1.0
 */
public class UseComparator {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        System.out.println("比较string，使用compareTo");
        String s1="AAA";
        String s2="BBB";
        String s3="AAA";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s1));

        System.out.println("比较Double，使用compareTo，需要转型为其包装类=========");
        double d1=9.85;
        double d2=9.81;
        double d3=9.85;
        System.out.println(((Double) d1).compareTo((Double)d2));
        System.out.println(((Double) d1).compareTo((Double)d3));
        System.out.println(((Double) d2).compareTo((Double)d3));

        System.out.println("自定义类型的比较，可以用内部或者外部比较器");
        System.out.println("内部比较器就是让自定义类型实现compareable结构并重写compareTo方法");
        System.out.println("内部比较器 按照age比较");
        HashSet<Student> haset=new HashSet<>();
        Student s11=new Student("lily",20,1.58);
        Student s22=(new Student("lulu",18,1.62));
        Student s33=(new Student("Mingming",15,1.35));
        Student s44=(new Student("lily",20,1.58));
        System.out.println(s11.compareTo(s22));
        System.out.println(s11.compareTo(s44));
        System.out.println(s33.compareTo(s22));



    }
}

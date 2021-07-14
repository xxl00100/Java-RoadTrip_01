package com.Day17_3_UseTreeSet;

import java.util.TreeSet;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 14:23
 * @Description: com.Day17_3_UseTreeSet
 * @version: 1.0
 */
public class TreeSetPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(25);
        ts.add(35);
        ts.add(45);
        ts.add(-99);
        ts.add(55);
        ts.add(25);
        ts.add(65);
        System.out.println(ts.size());
        System.out.println(ts);
//发现treeSet特点是自动按照升序排列，并且不重复
        System.out.println("======使用String类型=====");
        TreeSet<String> tss=new TreeSet<>();
        tss.add("Alili");
        tss.add("Blili");
        tss.add("Clili");
        tss.add("Flili");
        tss.add("Dlili");
        System.out.println(tss.size());
        System.out.println(tss);

//使用内部的比较器，在treeset中添加自定义类型
        System.out.println("使用内部的比较器，在treeset中添加自定义类型=========");
        TreeSet<Student> ts1=new TreeSet<>();
        Student s1=(new Student(8,"blili"));
        Student s2=new Student(4,"alili");
        Student s3=(new Student(9,"elili"));
        Student s4=(new Student(10,"flili"));
        Student s5=(new Student(1,"dlili"));
        Student s6=(new Student(8,"blili"));
        Student s7=new Student(4,"Glili");
        Student s8=(new Student(4,"Hlili"));
        Student s9=(new Student(4,"Ilili"));
        Student s10=(new Student(1,"Glili"));
        ts1.add(s1) ;
        ts1.add(s2) ;
        ts1.add(s3) ;
        ts1.add(s4) ;
        ts1.add(s5) ;
        System.out.println(ts1.size());
        System.out.println(ts1);
//使用内部的比较器，在treeset中添加自定义类型
        System.out.println("指定外部比较器，在treeset中添加自定义类型=========");
        OuterBijiao bj=new OuterBijiao();
        TreeSet<Student> ts2=new TreeSet<>(bj);  //给制定了比较器为bj
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);
        ts2.add(s6);
        ts2.add(s7);
        ts2.add(s8);
        ts2.add(s9);
        ts2.add(s10);
        System.out.println(ts2.size());
        System.out.println(ts2);
    }
}

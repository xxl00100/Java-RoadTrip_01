package com.Day17_3_UseTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 14:53
 * @Description: com.Day17_3_UseTreeSet
 * @version: 1.0
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //匿名内部类的方式制定比较器
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Student s1=(new Student(8,"flili"));
        Student s2=new Student(4,"alili");
        Student s3=(new Student(9,"clili"));
        Student s4=(new Student(10,"alili"));
        Student s5=(new Student(1,"dlili"));
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts.size());
        System.out.println(ts);


    }
}

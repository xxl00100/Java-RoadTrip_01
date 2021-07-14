package com.Day17_3_UseTreeSet;

import java.util.Comparator;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 14:30
 * @Description: com.Day17_3_UseTreeSet
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int age,String name ) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
// 内部比较器，比较年龄

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}


//再定义一个外部比较器，用于先比较年龄，年龄一样再比较名字
class OuterBijiao implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()-o2.getAge()==0){
            return ((String)o1.getName()).compareTo((String)o2.getName());
        }
        return o1.compareTo( o2);
    }
}

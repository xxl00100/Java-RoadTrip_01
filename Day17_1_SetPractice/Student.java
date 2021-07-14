package com.Day17_1_SetPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 8:26
 * @Description: com.Day17_1_SetPractice
 * @version: 1.0
 */
public class Student implements  Comparable<Student>{
    private String name;
    private int age;
    private double height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

//    需要重写compareto方法,通过年龄比较


    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}

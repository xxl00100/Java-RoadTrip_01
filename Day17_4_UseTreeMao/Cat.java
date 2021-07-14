package com.Day17_4_UseTreeMao;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 16:58
 * @Description: com.Day17_4_UseTreeMao
 * @version: 1.0
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private double weight;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {
    }

    public Cat( int age,String name, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //实现一个内部比较器,默认按照年纪进行比较

    @Override
    public int compareTo(Cat o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

//外部比较器，通过在测试类的匿名内部类进行
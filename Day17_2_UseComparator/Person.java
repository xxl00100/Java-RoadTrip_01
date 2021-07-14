package com.Day17_2_UseComparator;
import java.util.Comparator;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 9:22
 * @Description: com.Day17_2_UseComparator
 * @version: 1.0
 */
public class Person implements Comparable<Person> {
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

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

//    内部比较器使用年龄作为比较的依据
    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}

//外部比较器就是一个实现了comparetor接口的外部类，他提供了比较的方法供使用者调用，下面就是一个外部比较器的
//  比较年龄
class BiJiao01 implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}

//年龄相同的情况下，比较身高，年龄不同只比较年龄
class BiJiao02 implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()-o2.getAge()==0){
            return ((Double)o1.getHeight()).compareTo(((Double)o2.getHeight()));
        }
        else{
            return o1.getAge()-o2.getAge();
        }
    }
}

//比较名字
class BiJiao03 implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getName()).compareTo(o2.getName());
    }
}
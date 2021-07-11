package com.Day16_0_ReviewGenetics;

import java.util.ArrayList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 13:59
 * @Description: com.Day16_0_ReviewGenetics
 * @version: 1.0
 */
public class GeneticsPractice03 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {

        ArrayList<Object> a=new ArrayList<>();
        ArrayList<Person> b=new ArrayList<>();
        ArrayList<Student> c=new ArrayList<>();
        //上面三个集合是平行关系，互相赋值是错误的
//        泛型的上限：
        ArrayList<? extends Person> test1=null;
//  上面这句话的意思是：定义一个带有通配符的泛型集合test1， 该统配泛型都继承自Person，也就是说统配泛型
//    代表的泛型都是Person的之类，也就是说泛型的天花板上限就是Person这个标签
//        test1=a;  //报错，因为上限是person
        test1=b;
        test1=c;
//        后两个就没问题


//        泛型的下限：：
        ArrayList<? super Person> test2=new ArrayList<>();
        //这句话的意思是：通配符的泛型代表的是Person的父类，所以下限就是person
        test2=a;   //m没问题，因为Object是Person的父类
        test2=b;    //m没问题，因为 Person是下限
//        test2=c;  //出问题，因为Student是Person的之类，在下限之下
    }

}
class Person{
    //定义一个人的类
}
class Student extends Person{
    //定义一个学生类，继承人类
}


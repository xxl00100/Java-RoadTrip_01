package com.msb2;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/28 - 06 - 28 - 2:36
 * @Description: com.msb2
 * @version: 1.0
 */
public class Person {
    //显式的展现构造器
    public Person(){
        //此为空参构造器
         age=19;
         name="Lulu";
         height=1.72;
    }
    //构造器的重载
    public Person(String a,int b,double c){
        name=a;
        age=b;
        height=c;

    }
    //形参和属性重名的时候,采用就近原则.为了区分需要用this来指明你需要赋值的属性
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    String name;
    int age;
    double height;

    public void eat(){
        System.out.println("我每天都需要吃饭");
    }

}

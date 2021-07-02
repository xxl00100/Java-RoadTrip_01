package com.Day11_interFace;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 21:48
 * @Description: com.Day11_interFace
 * @version: 1.0
 */
public class Person {
    String name;
    int age;

}
//下面写一个测试类

class Test{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //接口不能创建对象,下面代码错误
/*        //    TestINterface t=new TestINterface() {
        //    }*/
        //强行实现需要通过多态,接口指向他的实现类对象.下面的代码就没有报错
        TestINterface t= new Student();
        //上面这一行通过多态成功实现了一个接口对象,下面访问她的内容
        System.out.println(t.NUM1);
        System.out.println(TestINterface.NUM1);
        t.a();
        t.b(50);
/*     因为这是一个接口TestINterface的对象,就访问不到接口TestINterface02的方法
        t.c();
        t.d(60);*/
        //再实现一个student对象,就可以调用到两个接口的方法
        Student s=new Student();
        System.out.println(s.NUM1);;
        System.out.println(s.NUM2);;
        s.a();
        s.b(100);
        s.c();
        s.d(600);







    }



        }

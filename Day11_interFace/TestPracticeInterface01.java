package com.Day11_interFace;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 22:23
 * @Description: com.Day11_interFace
 * @version: 1.0
 */
public class TestPracticeInterface01 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //多态创建接口对象
        PracticeInterface01 p=new Student1();
        System.out.println(p.NUM1);
        p.a();
        p.b(20);
/*        //静态方法不能这样调用,需要使用类名/接口名进行;
        p.c();*/
        PracticeInterface01.c();
        p.d();
        //上面是多态的调用
        System.out.println("下面通过实现接口的对象进行调用-----分割线");
        Student1 s1=new Student1();
        System.out.println(s1.NUM1);
        s1.a();
        s1.b(60);
        s1.d();
        PracticeInterface01.c();




    }
}

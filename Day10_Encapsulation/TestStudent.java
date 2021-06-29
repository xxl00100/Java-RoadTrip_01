package com.Day10_Encapsulation;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/30 - 06 - 30 - 1:19
 * @Description: com.Day10_Encapsulation
 * @version: 1.0
 */
public class TestStudent {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Mike");
        s1.setAge(23);
        s1.setSex("女");
        System.out.println(s1.getName()+"----"+s1.getAge()+"----"+s1.getSex());

        //测试性别
        Student s2 =new Student();
        s2.setSex("sdjfsjdkfjskd");
        System.out.println(s2.getName()+"----"+s2.getAge()+"----"+s2.getSex());
        //测试构造方法
        Student s3=new Student("Lili",55,"女");
        System.out.println(s3.getName()+"----"+s3.getAge()+"----"+s3.getSex());



    }


}

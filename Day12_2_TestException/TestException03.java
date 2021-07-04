package com.Day12_2_TestException;


import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 23:14
 * @Description: com.Day12_2_TestException
 * @version: 1.0
 *
 * 练习异常的处理方式
 * //类testException为主程序
 * 类学生用于创建对象
 *
 */
public class TestException03 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //演示1
        Student s=new Student();
       //由于set方法自己不处理可能的异常，所以调用者应该自行处理
        try {
            s.setInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(s);
        s.showInfo();
/*//        演示2
        Student s2=new Student() ;*/




    }


}





class Student{
    //三个属性
    private String name;
    private int age;
    private String sex;
    //提供一个set方法
    public void setInfo() throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入姓名：");
        this.name=sc.next();
        System.out.print("请输入年龄：");
        this.age=sc.nextInt();
        System.out.print("请输入性别：");
        String s=sc.next();
        if(s.equals("男")||s.equals("女")){
            this.sex=s;
        }
        else{
/*            //方法一直接自己处理，用throw一个运行异常
            throw new RuntimeException("你输入的性别不对！！");*/

/*
//            解决办法二，抛出一个检查异常
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
*/
//              解决办法三，向上抛出，自己不处理，让调用者处理
            throw new Exception();


        }
//        System.out.println();
    }


    //写一个获取属性的方法
    public void showInfo(){
        System.out.println(this.name+","+this.age+"岁,"+this.sex);
    }

    //提供一个空参构造器和三个三参数构造器


    public Student() {
    }


    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
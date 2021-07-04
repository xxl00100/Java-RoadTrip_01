package com.Day12_2_TestException;
import java.util.Scanner;

import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 22:50
 * @Description: com.Day12_2_TestException
 * @version: 1.0
 *
 * 练习throw ex异常
 */
public class TestException02 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
       //实现一个功能，当除数为0时程序异常
        try {
            devide();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //        定义一个除法功能
    public static void devide() throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("输入第一个数：");
        int num1=sc.nextInt();
        System.out.print("输入第二个数：");
        int num2=sc.nextInt();
        if(num2==0){

/*            //制造异常方式一：除数为0，抛出一个异常--清楚是什么异常
            throw new RuntimeException();*/

/*//            制造异常方式二：不清楚什么异常，直接抛父类，然后自行使用try catch处理这个异常--快捷键Alt+enter
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
//            制造异常方式3：抛给别人处理，自己不管。所以方法名上就会出现异常种类.注意看方法名--第35行。
//            谁调用了这个方法，就得负责解决这个异常，所以第17行，调用者进行了处理
            throw new Exception();

        }
        else{
            System.out.println("商："+num1/num2);
        }
    }


}

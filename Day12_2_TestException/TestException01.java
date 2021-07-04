package com.Day12_2_TestException;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 22:29
 * @Description: com.Day12_2_TestException
 * @version: 1.0
 * 练习使用try catch的四种用法
 *
 */
public class TestException01 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //第一种处理方式，什么也不做
        System.out.println("异常处理方式一：什么也不做");
        try{
            System.out.print("请输入第一个数");
            int num1=sc.nextInt();
            System.out.print("请输入第二个数");
            int num2=sc.nextInt();
            System.out.print("商为:"+num1/num2);
        }
        catch(Exception ex){
            //如果发生异常，什么也没做
        }
        System.out.println("异常处理方式二：给用户提示，对用户友好但是对程序员帮助不算大");
        try{
            System.out.print("请输入第一个数");
            int num1=sc.nextInt();
            System.out.print("请输入第二个数");
            int num2=sc.nextInt();
            System.out.print("商为:"+num1/num2);
        }
        catch(Exception ex){
            //给用户提示
            System.out.println("你的输入导致了异常，请检查！！");
        }

        System.out.println("异常处理方式三：打印一异常信息，对程序员友好但是对用户帮助不算大");
        try{
            System.out.print("请输入第一个数");
            int num1=sc.nextInt();
            System.out.print("请输入第二个数");
            int num2=sc.nextInt();
            System.out.print("商为:"+num1/num2);
        }
        catch(Exception ex){
            //给用户提示
            System.out.println("打印异常方式3.1--打印异常类名"+"\n"+ex.toString());  //ex.toString()等价于ex
            System.out.println("打印异常方式3.2--使用getmessage（）打印异常类的描述字符串"+"\n"+ex.getMessage());
            System.out.println("打印异常方式3.3--使用printStackTrace打印异常类的堆栈信息=积极推荐！  "+"\n");
            ex.printStackTrace();
        }
        System.out.println("异常处理方式四：抛出异常");
        try{
            System.out.print("请输入第一个数");
            int num1=sc.nextInt();
            System.out.print("请输入第二个数");
            int num2=sc.nextInt();
            System.out.print("商为:"+num1/num2);
        }
        catch(Exception ex){
            //抛出异常
            throw ex;
        }












    }


}

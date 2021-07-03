package com.Day11_OOP_homework;
import java.util.Scanner;



/**
 * @Auther: XXL00100
 * @Date: 2021/7/3 - 07 - 03 - 21:43
 * @Description: com.Day11_OOP_homework
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //先创建一个pizza工厂
        Pizza pizzaFactory=null;
        //创建一个Scanner用于输入内容
        Scanner sc= new Scanner(System.in);
        //下面设计主要内容
        System.out.print("请选择您要的披萨：1-培根2披萨；2-水果披萨:");
        String input1=sc.next();
        if("1".equals(input1)){
//            pizzaFactory=new PeiGenPizza();
            pizzaFactory=new PeiGenPizza();
            pizzaFactory.setPizzaNature(input1);
            pizzaFactory.showNature() ;
            pizzaFactory.setSpecial();


        }
        else if("2".equals(input1)){
//            pizzaFactory=new FruitPizza();
            pizzaFactory=new FruitPizza();
            pizzaFactory.setPizzaNature(input1);

            pizzaFactory.setSpecial();
//            pizzaFactory.setSpecial02();
            pizzaFactory.showNature() ;
//            System.out.println("配料水果:"+pizzaFactory.special02);

        }
        else{
            System.out.println("您输入的选项不正确！！！请只输入1或者2");
        }












    }
}

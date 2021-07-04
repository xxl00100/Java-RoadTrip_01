package com.Day12_1_PracticeOOP;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 14:17
 * @Description: com.Day12_1_PracticeOOP
 * @version: 1.0
 *
 * 定义一个简单工厂，用于生产可乐并展示
 */
public class DrinkShop {
    //定义一个生产和展示的方法
    public static void setAndShowDrinks(){
        Drinks d=null;
        System.out.print("请选择您要的饮料大类: 1-咖啡  2-奶茶  3-可乐：");
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:{
                Coffee cf=new Coffee();
                cf.setCharacters();
                cf.chooseKinds();
                cf.showInfo();
                d=cf;
            }
            break;
            case 2:{
                MilkTea mt=new MilkTea();
                mt.setCharacters();
                mt.chooseKinds();
                mt.showInfo();
                d=mt;
            }
            break;
            case 3:{
                Cola cl=new Cola();
                cl.setCharacters();
                cl.chooseKinds();
                cl.showInfo();
                d=cl;
            }
            break;



        }



    }



}

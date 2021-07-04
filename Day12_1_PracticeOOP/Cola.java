package com.Day12_1_PracticeOOP;

import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 14:15
 * @Description: com.Day12_1_PracticeOOP
 * @version: 1.0
 */
public class Cola extends Drinks{
    String kinds ;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("\n"+"的"+kinds);
    }

    //选择属性的方法
    public void chooseKinds() {
        System.out.print("请选择您要的种类： 1-可口可乐  2-百事可乐 ：");
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()){
            case 1: kinds="可口可乐";break;
            case 2: kinds="百事可乐";break;


        }


    }
}

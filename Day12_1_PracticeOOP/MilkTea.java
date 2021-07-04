package com.Day12_1_PracticeOOP;

import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 14:13
 * @Description: com.Day12_1_PracticeOOP
 * @version: 1.0
 */
public class MilkTea extends Drinks {
    String kinds ;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("\n"+kinds+"\n的奶茶");
    }

    //选择属性的方法
    public void chooseKinds() {
        System.out.print("请选择您要的配料： 1-椰果  2-红豆  3-布丁：");
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()){
            case 1: kinds="椰果";break;
            case 2: kinds="红豆";break;
            case 3: kinds="布丁";break;

        }


    }


}

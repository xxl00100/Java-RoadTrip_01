package com.Day12_1_PracticeOOP;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 13:38
 * @Description: com.Day12_1_PracticeOOP
 * @version: 1.0
 */
public class Coffee extends Drinks {
    String kinds ;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("\n"+kinds+"\n的咖啡");
    }

    //选择属性的方法
    public void chooseKinds() {
        System.out.print("请选择您要的种类： 1-加糖  2-加奶  3-不加配料");
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()){
            case 1: kinds="加糖";break;
            case 2: kinds="加奶";break;
            case 3: kinds="不加";break;

        }


    }
}

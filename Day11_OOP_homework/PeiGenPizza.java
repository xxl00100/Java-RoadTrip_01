package com.Day11_OOP_homework;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/3 - 07 - 03 - 21:27
 * @Description: com.Day11_OOP_homework
 * @version: 1.0
 */
public class PeiGenPizza extends Pizza{
        //培根披萨需要打印克数，所以需要特别设定
         //final String special01="培根克数：25克";

    @Override
    public void setSpecial() {
//        String special01="培根克数：25克";
        System.out.println("培根克数：25克");
    }
}

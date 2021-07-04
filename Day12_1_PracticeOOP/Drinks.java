package com.Day12_1_PracticeOOP;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 13:13
 * @Description: com.Day12_1_PracticeOOP
 * @version: 1.0
 * 实现一个自助饮品消费系统
 *
 */
public class Drinks {
//    定义三个属性
    String ice [] ={"加冰","不加冰"};
    String size []={"中杯","大杯","超大杯"};
    String receiveCharacters [] = new String[3];

    //定义一个方法，让选择这些属性
    public  void setCharacters(){
        //先定义一个数组用于接收这些属性
//        String receiveCharacters [] = new String[3];
        //定义一个scanner进行录取信息
        //选择是否加冰
        Scanner sc=new Scanner(System.in);
        System.out.print("请选择是否加冰：1-加冰 or 2-不加冰:");
        switch(sc.nextInt()){
            case 1: receiveCharacters[0]=ice[0];break;
            case 2: receiveCharacters[0]=ice[1];break;

        }
        //选择杯子尺寸
        System.out.print("请选择尺寸：1-中杯 or 2-大杯 or 3-超大杯:");
        switch(sc.nextInt()){
            case 1: receiveCharacters[1]=size[0]; break;
            case 2: receiveCharacters[1]=size[1];break;
            case 3: receiveCharacters[1]=size[2];break;

        }
        //选择要购买的数量
        System.out.print("请选择购买数量:");
        receiveCharacters[2]=sc.next();

        //返回获取的值
//        return "购买"+receiveCharacters[2]+"杯"+"\n"+receiveCharacters[1]+"\n"+receiveCharacters[0];

    }

    //定义一个展示的方法
    public void showInfo(){
        System.out.print("购买"+receiveCharacters[2]+"杯"+"\n"+receiveCharacters[1]+"\n"+receiveCharacters[0]);
    }

/*    //定义一个选择类型的方法
    public String chooseKinds(String kinds[]){
//        传入一个数组，然后把屏幕录取的数减一变成索引，赋值给chosenkind
        System.out.println("请选择您要的种类"+kinds.toString());
        String chosenKind;  //用于接收客户的选择
       return chosenKind=kinds[(sc.nextInt()-1)];

   */
}

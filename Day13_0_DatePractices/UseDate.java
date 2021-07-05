package com.Day13_0_DatePractices;
import java.util.Date;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/5 - 07 - 05 - 21:24
 * @Description: com.Day13_0_DatePractices
 * @version: 1.0
 *
 * 练习使用java.util.Date
 * 练习使用SQL date
 */
public class UseDate {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //创建一个date对象,
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.toString());
//        System.out.println(d.toGMTString());
        //上面为获取当前时间的两个方法,画横线代表已经废弃不推荐使用
//        System.out.println(d.toLocaleString());
        System.out.println(d.getTime());
//        System.out.println(d.getYear()+1900);
//        System.out.println(d.getMonth() + 1);
        System.out.println("计算循环10w次所需要的毫秒数");
        long start=System.currentTimeMillis();
        for(int i=1;i<100000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("总共耗时:"+(end-start)+"毫秒");

    }


}

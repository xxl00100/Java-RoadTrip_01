package com.Day13_0_DatePractices;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/5 - 07 - 05 - 22:04
 * @Description: com.Day13_0_DatePractices
 * @version: 1.0
 */
public class UseCalendar {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
//        calender无法直接创建对象,下面可以创建的方式
        Calendar cal1=new GregorianCalendar();  //多态
        Calendar cal2=Calendar.getInstance();
        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println("============fen ge xian===========");
        //calendar常用方法get
        System.out.println(cal1.get(Calendar.YEAR));
        System.out.println(cal1.get(Calendar.MONTH+1));
        System.out.println(cal1.get(Calendar.DATE));
        System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
        cal1.getActualMaximum(Calendar.DATE);
        cal1.getActualMinimum(Calendar.DATE);
        //calendar常用方法set
        cal1.set(Calendar.YEAR,1998);
        cal1.set(Calendar.MONTH,4);
        cal1.set(Calendar.DATE,12);
        //讲一个String转换为一个Calender内容;分为2布
        //第一string转换为java.sql.date;第二步然后调用calendar的settime方法
        Date d1= Date.valueOf("2021-10-19");
        cal2.setTime(d1);
        System.out.println(cal2);

    }
    
    
    
}

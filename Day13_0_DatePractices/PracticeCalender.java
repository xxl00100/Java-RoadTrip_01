package com.Day13_0_DatePractices;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/5 - 07 - 05 - 22:25
 * @Description: com.Day13_0_DatePractices
 * @version: 1.0
 * 实现一个查询日期的功能
 *
 *
 */
public class PracticeCalender {

    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //模块一:处理用户数据
        //第一步,让用户输入日期
        Scanner sc= new Scanner(System.in);
        System.out.print("请按照1998-05-01的格式输入您想要查询的日期:");
        String strDate=sc.next();
        //第二步,把这个日期转换为calender格式--两步走
        //第2.1步走使用java.sql.Date.valueOf()方法将string转换为java.sql.Date
        java.sql.Date d= java.sql.Date.valueOf(strDate);
        //第2.2步走,创建一个calender(有两种方式:多态或者getInstance),使用calender对象的setTime方法将获取的用户输入的这个日期转为calender时间
        Calendar cal= new GregorianCalendar();//或者写为Calendar cal=Calender.getInstance();
        cal.setTime(d);
        //上面的代码已经完成了用户输入时间的处理

        //模块二: 打印日历
        //先打印出固定的格式
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //然后获取用户输入日期当月的最大天数
        int maxDates=cal.getActualMaximum(Calendar.DATE);
        //需要获取当前日期是几号
        int nowday=cal.get(Calendar.DATE);
        //需要判断用户输入月份的第一天是星期几,用户输入的日期用不上了,
        // 所以直接再把用户的日期调为当月的第一天,使用set方法
        cal.set(Calendar.DATE,1);//本句的含义:把当前日期cal的天数(date)这个数字,设置为1
        //然后获取本月的这个一号,是本周的第几天,同一个变量进行接受
        int dayNumber=cal.get(Calendar.DAY_OF_WEEK);
//        第几天就说明前面有几个空格,现在打印空格.注意本周的第6天,前面应该是5个空格
        int count=0;//用于换行计数
        for(int i=0;i<dayNumber-1;i++){
            count++;
            System.out.print("\t");
        }
        //上面这个for用于打印前面的空格

        //根据确定的第一个空格,再按照顺序打印出这些日期
        for(int i=1;i<=maxDates;i++){
            count++;

            if(count%7==1){  //本次判断是否换行
                System.out.println();
            }
            if (nowday==i){
                System.out.print("*"+i+"\t");
            }
            else {
                System.out.print(i + "\t");
            }

        }













    }




}

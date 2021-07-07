package com.Day14_0_ReviewPracticeCalendar;
import java.util.Scanner;
import java.util.Calendar;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/7 - 07 - 07 - 20:26
 * @Description: com.Day14_0_ReviewPracticeCalendar
 * @version: 1.0
 */
public class ReviewCalenderPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //1、先获取用户的输入
        System.out.print("请按照2020-05-01的格式输入您想要查询的日期:");
        Scanner sc=new Scanner(System.in);
        String strDate=sc.next();
        //上面获取了用户的输入信息，现在需要把这个信息转换为日期


        //先转换为sql.date
        java.sql.Date d=java.sql.Date.valueOf(strDate);
        //实例化一个calendar，用于把sql.date转换为calender
        Calendar cal=Calendar.getInstance();
        cal.setTime(d);
        //2、上面这几步获取到了calendar型的日期

        //3、下面开始为打印做准备
        //3.1获取查询日期当月有多少天
        int maxDates=cal.getActualMaximum(Calendar.DATE);
//        3.2获取当前查询日期是这个月的第几天，用于突出显示
        int dateSerial=cal.get(Calendar.DATE);
        //3.3需要获取当前查询日期所在月份的第一天是周几
        cal.set(Calendar.DATE,1);  //先把当前查询日期设置为当月一号
        int dayOfWeekSerial=cal.get(Calendar.DAY_OF_WEEK);  //获取当前月份1号为周几

        //4 开始打印
        //4.1 打印固定的日期表头
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //4.2打印第一个日期前面的空格。例如一号为周四，获取的dayOfWeekSerial=5，前面应该有4个空格
        int count=0; //用于计数控制换行
        for(int i=1;i<dayOfWeekSerial;i++){
            count++;
            System.out.print("\t");
        }
        //4.3开始打印实际的内容
        for(int i=1;i<=maxDates;i++){
            //如果到7了，先换行
            if(count%7==0){
                System.out.println();
            }

            if(i==dateSerial){
                System.out.print(i+"*"+"\t");
            }
            else{
                System.out.print(i+"\t");
            }

                count++;
        }


    }

}

package com.Day13_0_DatePractices;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/5 - 07 - 05 - 21:56
 * @Description: com.Day13_0_DatePractices
 * @version: 1.0
 */
public class UseDateFormat {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        DateFormat df= new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        try {
            Date d=df.parse("2019-4-6 12:59:56");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String s=df.format(new Date());
        System.out.println(s);
    }
}

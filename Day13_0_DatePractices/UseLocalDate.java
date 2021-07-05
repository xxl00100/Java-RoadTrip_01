package com.Day13_0_DatePractices;




import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/5 - 07 - 05 - 23:19
 * @Description: com.Day13_0_DatePractices
 * @version: 1.0
 */
public class UseLocalDate {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //获取当前时间
        LocalDate L1=LocalDate.now();
        System.out.println(L1);
        LocalTime L2=LocalTime.now();
        System.out.println(L2);
        LocalDateTime L3=LocalDateTime.now();
        System.out.println(L3);

        //设置制定时间of()方法
       LocalDateTime of1= LocalDateTime.of(1999,5,23,12,52);
        System.out.println(of1);

//        LocalDateTime使用最多,下面为其他常用方法
        LocalDateTime L=LocalDateTime.now();
        System.out.println(L.getYear());
        System.out.println(L.getMonth());
        System.out.println(L.getMonthValue());
        System.out.println(L.getDayOfMonth());
        System.out.println(L.getDayOfWeek());
        System.out.println(L.getDayOfYear());
        System.out.println(L.getHour());
        System.out.println(L.getMinute());
        System.out.println(L.getSecond());

        //设置方法不叫set,叫做with
        System.out.println(L.withMonth(2));//把L的月份改为2;其余也一样

        //练习将LocalDateTime与字符串之间的转换 DateTimeFormatter
        //生成一个按照自己要求的格式进行转换的转换器
        DateTimeFormatter df=  DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s=df.format(L);//日期转字符串方法
        TemporalAccessor p=df.parse("2028-12-31 08:12:50");//字符串转日期方法,需要用TemporalAccessor类型接受转化的结果
        System.out.println(s);
        System.out.println(p);


    }
}

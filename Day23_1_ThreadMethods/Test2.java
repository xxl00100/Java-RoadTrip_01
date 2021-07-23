package Phase2.Day23_1_ThreadMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 13:40
 * @Description: Phase2.Day23_1_ThreadMethods
 * @version: 1.0
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws InterruptedException {
        //一直打印时间,设置秒表
            DateFormat df=new SimpleDateFormat("HH:mm:ss");
        while(true){
            Date d=new Date();
            System.out.println(df.format(d));
            Thread.sleep(1000);
        }

    }
}

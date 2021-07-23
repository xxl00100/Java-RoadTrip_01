package Phase2.Day24_0_ReviewDay23;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 13:54
 * @Description: Phase2.Day24_0_ReviewDay23
 * @version: 1.0
 */
public class ReviewTest  {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws InterruptedException {
        DateFormat df=new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date d=new Date();
            System.out.println(df.format(d));
            Thread.currentThread().sleep(1000);
        }
    }
}

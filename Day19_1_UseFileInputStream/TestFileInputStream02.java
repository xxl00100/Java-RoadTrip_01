package Phase2.Day19_1_UseFileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 21:27
 * @Description: Phase2.Day19_1_UseFileInputStream
 * @version: 1.0
 *
 * 利用字节流，挨个字节读取非文本文件
 */
public class TestFileInputStream02 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.有一个源文件
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo.png");
//        2.有一个字节流，连接到源文件
        FileInputStream fis=new FileInputStream(f);
//        3.开始挨个读取字节
        int n = fis.read();
        int count=0;
        long startTime = System.currentTimeMillis();
        while (n!=-1){
            System.out.println(n+"\t");
            n=fis.read();
            count++;

        }
        long endTime = System.currentTimeMillis();

        System.out.println("预期字节数1481222："+count);
        System.out.println("耗时："+(endTime-startTime)+"毫秒");
//        4.关闭字节流
        fis.close();
//--------下面是练习二
        System.out.println("======经过测试，上面的办法明显很耗时");
        System.out.println("======采用缓冲数组一次读取多个值");
//        1.继续使用同一个源文件
//        2.创建一个字节流
        FileInputStream fis1=new FileInputStream(f);
//        3.创建一个缓冲数组进行操作

        byte[] b=new byte[1024*8];  //缓冲数组
        int len1 = fis1.read(b);      //每次写入数组的有效长度
        int count1=0;                   //  用于记录往数组中写入了几次
        long startTime1 = System.currentTimeMillis();
        while (len1!=-1){
            for (int i=0;i<len1;i++){
                System.out.print(b[i]+"\t");
            }
            len1=fis1.read(b);
            count1++;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("使用缓冲数组只执行了："+count1+"次");
        System.out.println("使用缓冲数组只耗时："+(endTime1-startTime1)+"毫秒");
        System.out.println("使用缓冲数组节约了："+(endTime1-startTime1-endTime+startTime)+"毫秒");
//        4.关闭字节流
        fis1.close();

    }
}

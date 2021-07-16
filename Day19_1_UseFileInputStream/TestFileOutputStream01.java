package Phase2.Day19_1_UseFileInputStream;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 21:55
 * @Description: Phase2.Day19_1_UseFileInputStream
 * @version: 1.0
 * 使用FileOutputStream字节流，一个一个的写，第二种使用缓冲数组分批次写入
 */
public class TestFileOutputStream01 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.先有一个源文件
        File f0=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo.png");
//        2.有一个写出的文件
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo1.png");
//        3.有一个读取的字节流
        FileInputStream fis=new FileInputStream(f0);
//        4.有一个写出的字节流
        FileOutputStream fos=new FileOutputStream(f1);
//        5.开始操作，方法一，一个一个字节读取，然后写出
        int n = fis.read();
        while (n!=-1){
            fos.write(n);
            n=fis.read();
        }
//        6.关闭字节流；先用后关
        fos.close();
        fis.close();


    }
}

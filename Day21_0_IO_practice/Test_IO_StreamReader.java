package Phase2.Day21_0_IO_practice;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 21:32
 * @Description: Phase2.Day21_IO_practice
 * @version: 1.0
 * 练习 InputStreamReader
 */
public class Test_IO_StreamReader {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        FileInputStream fir=new FileInputStream(f1);       //获取一个字节流
        InputStreamReader isr=new InputStreamReader(fir,"utf-8");  //将字节流转换为字符流
        char[] ch=new char[20];
        int len = isr.read(ch);
        while (len!=-1){
            System.out.println(new String(ch,0,len));
            len=isr.read(ch);
        }


    }
}

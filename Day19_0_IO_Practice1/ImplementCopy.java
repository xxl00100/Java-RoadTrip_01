package Phase2.Day19_0_IO_Practice1;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 14:41
 * @Description: Phase2.Day19_0_IO_Practice1
 * @version: 1.0
 * 把目录下D:\Asofts\JavaDemos\src\Phase2\test.txt中的内容复制到同文件夹下的Demo.txt中
 */
public class ImplementCopy {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.源文件
        File f0=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
//        2.写入的目标文件,分别用三中方法实现
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\Demo1.txt");
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\Demo2.txt");
        File f3=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\Demo3.txt");
//        3.创建读对象
        FileReader fr1=new FileReader(f0);
        FileReader fr2=new FileReader(f0);
        FileReader fr3=new FileReader(f0);
//        4.创建写对象,分别为接下来要使用的三中方法创建写对象
        FileWriter fw1=new FileWriter(f1);
        FileWriter fw2=new FileWriter(f2);
        FileWriter fw3=new FileWriter(f3);
//        4.1第一种方法写入demo1，一个一个字符的写入
        int n = fr1.read();
        while (n!=-1){
            fw1.write(n);
            n=fr1.read();
        }
        fw1.close();
        fr1.close();

//        4.2第二种方法利用缓冲数组
        char[] ch=new char[6];
        int len1=fr2.read(ch);  //fr1每读到一个内容就写入ch数组，返回最终写进去几次
        while (len1!=-1){
            fw2.write(ch,0,len1);   //写出数组中有效长度上的内容
            len1=fr2.read(ch);
        }
        fw2.close();
        fr2.close();        //关闭，先开后关，后开先关

//        4.3将缓冲数组直接转换为字符串，写入字符串
        char[] ch1=new char[6];
        int len2=fr3.read(ch1);
        while (len2!=-1){
            String s=new String(ch1,0,len2);
            fw3.write(s);
            len2=fr3.read(ch1);
        }
//        关闭
        fw3.close();
        fr3.close();


    }
}

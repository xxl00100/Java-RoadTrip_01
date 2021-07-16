package Phase2.Day19_0_IO_Practice1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 14:24
 * @Description: Phase2.Day19_0_IO_Practice1
 * @version: 1.0
 * 实现将从java中写入内容到test.txt中
 */
public class TestWriteFile {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        FileWriter fw=new FileWriter(f,true);  //默认不写true的话为false；false=替代模式；true=添加模式
        String str="Little Mike, Please Run Away!!!";
        char[] chars=str.toCharArray();       //定义一个缓冲数组
        fw.write(chars);                //写出缓冲数组中的内容
        fw.close();             //关闭

    }
}

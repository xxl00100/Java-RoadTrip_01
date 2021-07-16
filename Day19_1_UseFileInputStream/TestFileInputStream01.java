package Phase2.Day19_1_UseFileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 21:16
 * @Description: Phase2.Day19_1_UseFileInputStream
 * @version: 1.0
 * 使用字节流读取文本文件文件
 */
public class TestFileInputStream01 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.有一个源文件
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
//        2.创建一个字节流，链接这个源文件
        FileInputStream fis=new FileInputStream(f);
//        3.开始读取操作
        int n=fis.read();
        int count=0;
        while (n!=-1){
            count++;
            System.out.println(n);
            n=fis.read();
        }
        System.out.println("预期字节数202："+count);
//        4.关闭流
        fis.close();










    }
}

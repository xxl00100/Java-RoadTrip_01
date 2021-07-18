package Phase2.Day20_0_ReviewDay19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/18 - 07 - 18 - 10:07
 * @Description: Phase2.Day20_0_ReviewDay19
 * @version: 1.0
 * 练习使用filereader filewriter复制文件夹中的test.txt，并生成一个新的test4.txt
 */
public class Practice1_ReviewFileReader {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.有一个源文件
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
//        2.搭建读取源文件中的内容的通道
        FileReader fr=new FileReader(f1);
//        3.有一个输出的目标文件
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test4.txt");
//        4.又有个通往目标文件的通道
        FileWriter fw=new FileWriter(f2);
//        5.开始执行读取操作
        char[] ch=new char[8];  //定义一个字节类型数组，提高获取效率
        int n = fr.read(ch);
//        6.执行写出操作
        while (n!=-1){
            fw.write(ch,0,n);
            n = fr.read(ch);
        }
//        7.关闭
        fw.close();
        fr.close();

    }

}

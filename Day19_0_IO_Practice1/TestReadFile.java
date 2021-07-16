package Phase2.Day19_0_IO_Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 13:53
 * @Description: Phase2.Day19_0_IO_Practice1
 * @version: 1.0
 * 实现从目录下D:\Asofts\JavaDemos\src\Phase2\test.txt中读取文件的功能
 */
public class TestReadFile {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.首先得有一个操作文件test.txt的对象f
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
//        2.有一个把内容传输到java中的通道
        FileReader fr=new FileReader(f);
//        3.执行读取的操作
        int n = fr.read();//该方法返回读取到内容的ASCII码，把它转换为字符进行接收；如果读取到的内容为空返回-1
//        4.对于获取到的内容在java中进行操作
        while (n!=-1){
            System.out.print((char) n+"\t");  //将读取到内容的ASCII码转换为字符，并打印
            n=fr.read();
        }
//        5.操作完之后必须手动关闭流
            fr.close();




    }
}

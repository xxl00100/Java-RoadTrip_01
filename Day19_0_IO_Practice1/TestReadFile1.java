package Phase2.Day19_0_IO_Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 14:14
 * @Description: Phase2.Day19_0_IO_Practice1
 * @version: 1.0
 * 一次性获取6个字符，提高读取效率
 */
public class TestReadFile1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        FileReader fr= new FileReader(f);
//        创建一个Char数组进行接受
        char[] ch=new char[6];
        int len = fr.read(ch); //传入ch数组，每一次读取的内容都被填充到ch中，最终返回填入了几次
        while (len!=-1){
            String s=new String(ch,0,len);
            System.out.print(s+"\t");
            len=fr.read(ch);
        }
        fr.close();
    }
}

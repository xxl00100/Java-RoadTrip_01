package Phase2.Day19_4_InputStreamReader_Writer;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 22:43
 * @Description: Phase2.Day19_4_InputStreamReader_Writer
 * @version: 1.0
 */
public class UseInputStreamReader {
    //这是main方法,是程序的入口
    public static void main(String[] args)  throws IOException {
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        FileInputStream fis=new FileInputStream(f1);
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        char[] ch=new char[30];
        int len = isr.read(ch);
        while (len!=-1){
            System.out.println(new String(ch,0,len));
            len = isr.read(ch);
        }
        isr.close();


    }
}

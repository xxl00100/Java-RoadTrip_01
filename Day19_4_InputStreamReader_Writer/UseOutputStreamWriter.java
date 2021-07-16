package Phase2.Day19_4_InputStreamReader_Writer;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 22:50
 * @Description: Phase2.Day19_4_InputStreamReader_Writer
 * @version: 1.0
 */
public class UseOutputStreamWriter {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
      //源文件
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
//        目标文件
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test3.txt");
//        输入方向：读取字节流
        FileInputStream fis=new FileInputStream(f1);
//        输入方向：转换为字符流
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
//        输出方向
        FileOutputStream fos=new FileOutputStream(f2);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");

//        操作细节
        char[] ch=new char[30];
        int len = isr.read(ch);
        while (len!=-1){
            osw.write(ch,0,len);
            len=isr.read(ch);
        }
        osw.close();
        isr.close();

    }
}

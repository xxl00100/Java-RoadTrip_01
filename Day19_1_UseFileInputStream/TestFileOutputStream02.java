package Phase2.Day19_1_UseFileInputStream;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 22:03
 * @Description: Phase2.Day19_1_UseFileInputStream
 * @version: 1.0
 * 使用缓冲数组，一次性写入多个内容
 */
public class TestFileOutputStream02 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo.png");
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo2.png");
        FileInputStream fis=new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream(f2)      ;
        byte[] b=new byte[1024*8];
        int len = fis.read(b);
        while (len!=-1){
            fos.write(b,0,len);
            len=fis.read(b);
        }
        fos.close();
        fis.close();


    }
}

package Phase2.Day19_2_UseBufferedInput_OutputStream;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 22:13
 * @Description: Phase2.Day19_2_UseBufferedInput_OutputStream
 * @version: 1.0
 */
public class TestBuffered_I_O_Stream {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\testExcel.xls");
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\testExcel2.xls");
        FileInputStream fis=new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream(f2);
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] b=new byte[1024*8];
        int len = bis.read(b);
        while (len!=-1){
            bos.write(b,0,len);
            len=bis.read(b);
        }
        bos.close();
        bis.close();



    }
}

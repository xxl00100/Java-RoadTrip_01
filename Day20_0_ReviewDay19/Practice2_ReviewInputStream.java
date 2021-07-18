package Phase2.Day20_0_ReviewDay19;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/18 - 07 - 18 - 10:22
 * @Description: Phase2.Day20_0_ReviewDay19
 * @version: 1.0
 * 采用缓冲数组的方式
 * 使用fileInputStream和FileOUtputStream字节流分别拷贝一个文本文件，和一个非文本文件
 * 1-文本文件，将文件夹下的test.txt拷贝为test5.text
 * 2-非文本文件，将文件夹下的photo.png拷贝为photo3.png
 *
 */
public class Practice2_ReviewInputStream {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("现在是使用FileInputStream和FileoutputStream拷贝文本文件");
//        1.读取方向
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        FileInputStream fis=new FileInputStream(f1);
//        2.输出方向
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test5.txt");
        FileOutputStream fos=new FileOutputStream(f2);

//        3.操作方向
        byte[] b =new byte[20];   //小推车，一次搬运8个，提高效率
        int count =0;           //用于计数，小推车搬运了几次
        int num = fis.read(b);
        int len = fis.read(b);
        while (len!=-1){
            count++;
            for (int i=0;i<len;i++){
                char ch=(char)b[i];
                fos.write(ch);
            }

            len=fis.read(b);
        }

//        4.关闭流
        fos.close();
        fis.close();
        System.out.println("小推车一共搬运了："+count+"次");
        System.out.println("期待的字节数为216: "+len);
        System.out.println("期待的字节数为216: "+num);
        System.out.println("现在是使用FileInputStream和FileoutputStream拷贝结束");
        System.out.println("========================================================");
        System.out.println("现在是使用FileInputStream和FileoutputStream拷贝图片");
        File f3=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo.png");
        FileInputStream fis3=new FileInputStream(f3);
        File f4=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\photo3.png");
        FileOutputStream fos4=new FileOutputStream(f4);
        byte[] b3=new byte[1024*6];
        int len3 = fis3.read(b3);
        while (len3!=-1){
            fos4.write(b3,0,len3);
            len3=fis3.read(b3);
        }
        fos4.close();
        fis3.close();

        System.out.println("现在是使用FileInputStream和FileoutputStream拷贝图片结束");






    }
}

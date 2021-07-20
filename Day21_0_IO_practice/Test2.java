package Phase2.Day21_0_IO_practice;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 22:13
 * @Description: Phase2.Day21_IO_practice
 * @version: 1.0
 *
 * 练习使用DataInputStream和DataOutputStream
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("现在开始把程序的内容写出到文件中");
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo2.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("你好");
        dos.writeBoolean(false);
        dos.writeDouble(9.65);
        dos.writeInt(6565);
        dos.close();
        System.out.println("现在开始把写出的内容读取到程序中");
        DataInputStream dis=new DataInputStream(new FileInputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo2.txt")));
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        dis.close();


    }
}

package Phase2.Day21_1_IO_Practice;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 22:47
 * @Description: Phase2.Day21_1_IO_Practice
 * @version: 1.0
 */
public class Test1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo1.txt")));
        oos.writeObject("俩好呀，小mikky665");
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo1.txt")));
        String s=(String) ois.readObject();
        System.out.println(s);
        ois.close();












    }
}

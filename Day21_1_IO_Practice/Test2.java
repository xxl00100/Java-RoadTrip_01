package Phase2.Day21_1_IO_Practice;

import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 22:53
 * @Description: Phase2.Day21_1_IO_Practice
 * @version: 1.0
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("序列化自定义的类型");
        Person p =new Person("lili",19);
        System.out.println("被序列化的对象地址P为："+p);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo2.txt")));
        oos.writeObject(p);
        oos.close();
        System.out.println("因为实现了Serilizable接口，所以已经序列化成功");
        System.out.println("现在进行反序列化");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo2.txt")));
        Person p1=(Person)(ois.readObject());
        System.out.println("反序列化得到的对象地址P1为："+p1);
        ois.close();








    }
}

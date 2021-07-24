package Phase5.Day25_1_TCP_Practice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 21:32
 * @Description: Phase5.Day25_0_ObjectCommunication
 * @version: 1.0
 * 使用网络通信,传输一个对象
 */
public class TestClient1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("客户端启动了..........");
        //1.先让用户输入用户名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        System.out.println("请输入登陆密码:");
        String psw = sc.next();

//        2.封装用户的登陆信息
        User1 u1=new User1(userName,psw);

//        3.创建套接字,准备输出这个对象
        Socket s=new Socket("192.168.0.101",8888);
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeObject(u1);

//        4.接收服务器发回的消息
        InputStream is=s.getInputStream();
        ObjectInputStream ois=new ObjectInputStream(is);
//        4.1接受服务器的信息确认
        User1 str = (User1) ois.readObject();
        System.out.println("收到的服务器反馈:---"+str.toString());
//        4.2接受登陆状态
        String loginStatus=(String)ois.readObject();
        System.out.println("收到的登陆状态----"+loginStatus);



//        5.关闭流+网络资源
        ois.close();
        oos.close();
        s.close();




    }
}

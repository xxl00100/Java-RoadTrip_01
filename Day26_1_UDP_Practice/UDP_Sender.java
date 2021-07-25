package Phase5.Day26_1_UDP_Practice;




import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/25 - 07 - 25 - 23:00
 * @Description: Phase5.Day26_1_UDP_Practice
 * @version: 1.0
 */
public class UDP_Sender {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线啦........");
//        1.开启发送的UDP套接字,快递员DatagramSocket
        DatagramSocket ds = new DatagramSocket(8888);

//        2.从键盘获取需要发送的内容
        Scanner sc = new Scanner(System.in);
        while (true){   //        6.放入循环中执行,循环发送信息
              //  一.  发送模块
                System.out.print("请输入要发送的信息:");
                String message = sc.next();

//        3.将内容打包为一个数组byte
                byte[] bytes1= message.getBytes();

//        4.把byte数组放到快递员的邮车里面DatagramPacket
                DatagramPacket dp1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("192.168.0.100"), 9999);

//        5.快递员带着邮车出发
                ds.send(dp1);

            if (message.equals("ByeBye")){
                System.out.println("您下线了...");
                break;
            }

//            =============分割线==============
             ///二  接收模块
                byte[] bytes2 = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(bytes2,bytes2.length);
                ds.receive(dp2);
                byte[] data = dp2.getData();
                System.out.println("老师回答说:"+new String(data,0,data.length));

//                加一个判断,用于下线



        }



    }
}

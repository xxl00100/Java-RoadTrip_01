package Phase5.Day26_1_UDP_Practice;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/25 - 07 - 25 - 23:00
 * @Description: Phase5.Day26_1_UDP_Practice
 * @version: 1.0
 */
public class UDP_Receiver {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线啦........");
        DatagramSocket ds = new DatagramSocket(9999);
        Scanner sc = new Scanner(System.in);
        while (true) {

//       1. 先收到学生发来的消息
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);
            byte[] data = dp.getData();
            String ReceivedMessage = new String (data, 0,data.length);
            System.out.println("学生对您说:"+ ReceivedMessage);

            if (ReceivedMessage.equals("ByeBye")){
                System.out.println("学生已经下线了.....");
                ds.close();
                break;
            }
            else {
//            2.回复学生
                System.out.print("您回复学生的内容:");
                String message = sc.next();
                byte[] bytes1 = message.getBytes();
                DatagramPacket dp1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("192.168.0.100"), 8888);
                ds.send(dp1);
            }
        }









    }
}

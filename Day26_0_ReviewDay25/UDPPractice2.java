package Phase5.Day26_0_ReviewDay25;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/25 - 07 - 25 - 19:56
 * @Description: Phase5.Day26_0_ReviewDay25
 * @version: 1.0
 */
public class UDPPractice2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("接受人上线了>>>..........");
//        1.创建接受套接字,指明从那个门把东西收进来
        DatagramSocket ds = new DatagramSocket(9999);
//        2.创建数组用于接收获取的内容
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
//        2.3执行接收动作
        ds.receive(dp);
//        3.把数据拿出来
        byte[] data = dp.getData();
        System.out.println(new String(data,0,data.length));

        ds.close();


    }
}

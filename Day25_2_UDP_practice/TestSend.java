package Phase5.Day25_2_UDP_practice;

import java.io.IOException;
import java.net.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 23:08
 * @Description: Phase5.Day25_2_UDP_practice
 * @version: 1.0
 *
 * 实现UDP的单向通信
 */
public class TestSend {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线了.......");
//        1.创建UDP套接字,指定信息从那个端口发送出去
        DatagramSocket dgs = new DatagramSocket(8888);
//        2.准备信息的包装袋，把信息存到这个包装袋中发送出去
//        2.1要发送的信息包装到数组中
        String str = "你好";
        byte[] bytes = str.getBytes();
//        2.2把要传送的数组,放入包装袋dgp中.
//        包装袋需要四个参数:数组;数组长度;接收方的地址;接收方的接收端口号
        DatagramPacket dgp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);
//        3.发送出去
        dgs.send(dgp);
//        4.关闭套接字资源
        dgs.close();
    }
}

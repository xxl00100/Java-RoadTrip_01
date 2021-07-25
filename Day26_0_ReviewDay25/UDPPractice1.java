package Phase5.Day26_0_ReviewDay25;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/25 - 07 - 25 - 19:47
 * @Description: Phase5.Day26_0_ReviewDay25
 * @version: 1.0
 *
 *
 * 模拟发送方
 */
public class UDPPractice1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("发送人上线n......");
//        1.创建套接字  需要制定发送出口(快递员从哪儿把货送出去)
        DatagramSocket ds = new DatagramSocket(8888);
//        2.装备需要发送的信息
        String str = "你好呀,小Mikky";
//        2.1把需要传送的信息打包为一个数组
        byte[] bytes =str.getBytes();
//        2.2将打包好的信息,传给套接字这个快递员,告诉快递员送到哪儿,从那个们送进去
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.0.100"),9999);
//        2.3让快递员执行送这个动作
        ds.send(dp);

        ds.close();








    }
}

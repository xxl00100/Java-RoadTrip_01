package Phase5.Day25_2_UDP_practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 23:18
 * @Description: Phase5.Day25_2_UDP_practice
 * @version: 1.0
 */
public class TestReceive {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动啦.......");
//        1.创建接收方套接字.并制定从那个端口接收别人发来的信息
        DatagramSocket ds = new DatagramSocket(9999);
//        2.准备接收别人发来的信息
        byte[] bytes = new byte[1024];
        DatagramPacket dp= new DatagramPacket(bytes,bytes.length);

//        3.接收动作,该动作是把接到的东西,放入一个接收数组中
        ds.receive(dp);         //ds这个套接字进行接收,是受到的东西放入dp中

//        4.读取收到的内容
        byte[] data = dp.getData();
        String str=new String(data,0,dp.getLength());       //只获取有效部分的内容
        System.out.println(str);


    }

}

package Phase2.Day24_5_NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:27
 * @Description: Phase2.Day24_5_NetWork
 * @version: 1.0
 * 实现封装IP
 */
public class Test_InetAddress {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia1=InetAddress.getByName("192.168.0.101");
        System.out.println(ia1);
        InetAddress ia2=InetAddress.getByName("localhost");
        System.out.println(ia2);
        InetAddress ia3=InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);
        InetAddress ia4=InetAddress.getByName("sleigh");
        System.out.println(ia4);
        InetAddress ia5=InetAddress.getByName("www.youtube.com");
        System.out.println(ia5);
        System.out.println("====");
        System.out.println(ia5.getHostAddress());
        System.out.println(ia5.getHostName());


    }
}

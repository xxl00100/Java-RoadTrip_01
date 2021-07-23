package Phase2.Day24_5_NetWork;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:36
 * @Description: Phase2.Day24_5_NetWork
 * @version: 1.0
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        InetSocketAddress isa=new InetSocketAddress("192.168.0.101",8080);
        System.out.println(isa);

        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());
        System.out.println("--------");
        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());


    }
}

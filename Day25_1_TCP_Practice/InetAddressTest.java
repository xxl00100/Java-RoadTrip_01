package Phase5.Day25_1_TCP_Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 21:41
 * @Description: Phase5.Day25_1_AcceptRequirements
 * @version: 1.0
 */
public class InetAddressTest {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia=InetAddress.getByName("localhost");
        System.out.println(ia);

    }
}

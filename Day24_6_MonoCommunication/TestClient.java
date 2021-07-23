package Phase2.Day24_6_MonoCommunication;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:52
 * @Description: Phase2.Day24_5_MonoCommunication
 * @version: 1.0
 */
public class TestClient {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.创建套接字
        Socket s=new Socket("192.168.0.101",8888);
//        2.利用输出流处理数据,通过socket传送
        OutputStream os = s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
//        3.使用数据流获取数据
        dos.writeUTF("你好呀,小傻瓜");

//        4.接受服务器发回的消息
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String str1 = dis.readUTF();
        System.out.println("服务器发回的信息是:"+str1);



//        5.关闭流,关闭socket
            dis.close();
            dos.close();
            s.close();


    }
}

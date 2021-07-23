package Phase2.Day24_6_MonoCommunication;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:57
 * @Description: Phase2.Day24_5_MonoCommunication
 * @version: 1.0
 */
public class TestServer {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.创建服务器的套接字
        ServerSocket ss=new ServerSocket(8888);
//        2.等待要接受的消息
        Socket s = ss.accept();
//        3.读取收到的消息
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String str = dis.readUTF();
//         4.展示接收到的消息
        System.out.println("客户端发给我的信息是:"+str);

//        5.向客户端反馈已经接收到信息
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("客户端你好,我已经收到你的消息:"+str);

//        6.关闭流和网络资源
        dos.close();
        dis.close();
        s.close();
        ss.close();

    }
}

package Phase5.Day25_1_TCP_Practice;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 21:48
 * @Description: Phase5.Day25_0_ObjectCommunication
 * @version: 1.0
 */
public class TestServer1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("服务器启动了..........");
//        1.创建服务器套接字

        ServerSocket ss=new ServerSocket(8888);
        int count=0;  //用于记录访问的人数
//        2.死循环,让server一直接收客户端的消息
        while (true){
//            2.1 打开接收动作
            Socket s=ss.accept();
//            2.2接收完毕之后调用服务器现场执行相关操作
            new ServerThread(s).start();
//            2.3 展示客户端访问的次数,并反馈客户端的IP
            System.out.println("第"+count++ +"个客户端进行了访问,其IP为:"+s.getInetAddress());


        }




//











    }
}

package Phase5.Day25_0_ObjectCommunication;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 21:48
 * @Description: Phase5.Day25_0_ObjectCommunication
 * @version: 1.0
 */
public class TestServer {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        1.创建服务器套接字
        ServerSocket ss=new ServerSocket(8888);
//        2.开始做好接收的准备
        Socket s=ss.accept();
//        3.读取客户端传送过来的内容
        InputStream is = s.getInputStream();
        ObjectInputStream ois=new ObjectInputStream(is);
        User user1 =(User)ois.readObject();
        String loginStatus =null;   //用于告诉客户端是否登陆成功
        Boolean flag=false;  //用于判断是否账号密码正确
        if(user1.getUserName().equals("Mike") && user1.getPsw().equals("998877")){
            flag=true;
        }

//        4.根据从客户端得到的信息进行操作
        if (flag){
            System.out.println("验证成功,允许登陆!");
            loginStatus="账号密码正确,登陆成功!";
        }
        else{
            System.out.println("账号密码不正确,不允许登陆!");
            loginStatus="账号或密码错误,登陆失败!";
        }

//        5.告诉客户端,已经接收到的消息是什么;并通知其登陆状态
        OutputStream os=s.getOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeObject(user1);
        oos.writeObject(loginStatus);


//        6.关闭流+关闭网络资源
        oos.close();
        ois.close();
        s.close();
        ss.close();









    }
}

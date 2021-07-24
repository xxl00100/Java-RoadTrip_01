package Phase5.Day25_1_TCP_Practice;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 22:48
 * @Description: Phase5.Day25_1_TCP_Practice
 * @version: 1.0
 */
public class ServerThread extends Thread {
    Socket s=null;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //    3.读取客户端传送过来的内容
        InputStream is = null;
        try {
            is = s.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        User1 user1 = null;
        try {
            user1 = (User1)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
        OutputStream os= null;
        try {
            os = s.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(user1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(loginStatus);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

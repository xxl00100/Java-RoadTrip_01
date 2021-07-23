package Phase2.Day24_1_ThreadSafty;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 14:35
 * @Description: Phase2.Day24_1_ThreadSafty
 * @version: 1.0
 */
public class TestLock implements Runnable {
    static int ticket=20;
    Lock l=new ReentrantLock();  //创建一个锁
    @Override
    public void run() {

        for (int i=1;i<=100;i++){
            l.lock();  //把锁拿过来锁上
            try {
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"------"+ticket--);
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
           finally {  //即使有异常也能够把锁解开
                l.unlock();         //把锁给解开
            }
        }

    }
}

class test4{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestLock tl=new TestLock();
        Thread t1=new Thread(tl,"窗口一");
        t1.start();
        Thread t2=new Thread(tl,"窗口二");
        t2.start();
        Thread t3=new Thread(tl,"窗口三");
        t3.start();

    }
}
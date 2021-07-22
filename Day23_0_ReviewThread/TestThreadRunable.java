package Phase2.Day23_0_ReviewThread;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/22 - 07 - 22 - 13:15
 * @Description: Phase2.Day23_0_ReviewThread
 * @version: 1.0
 *
 * 第二种创建线程的方式，并实现抢火车票的功能
 */
public class TestThreadRunable implements  Runnable {
    int totalTicket=10;


    @Override
    public void run() {
        for (int i=1;i<100;i++){
            if (totalTicket>0){
                System.out.println("我在"+Thread.currentThread().getName()+"抢到了第"+totalTicket--+"火车票");
            }
        }
    }
}


class  test2{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestThreadRunable ttr=new TestThreadRunable();
        Thread t1=new Thread(ttr,"窗口一");
        t1.start();
        Thread t2=new Thread(ttr,"窗口二");
        t2.start();
        Thread t3=new Thread(ttr,"窗口三");
        t3.start();
    }
}
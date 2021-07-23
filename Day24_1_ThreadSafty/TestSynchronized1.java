package Phase2.Day24_1_ThreadSafty;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 14:16
 * @Description: Phase2.Day24_1_ThreadSafty
 * @version: 1.0
 */
public class TestSynchronized1 implements Runnable {
    static int ticket=20;

    public TestSynchronized1() {
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            synchronized (this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket--+"张火车票");
                }
            }
        }
    }
}

class test2{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestSynchronized1 ts1=new TestSynchronized1();
        Thread t1=new Thread(ts1,"窗口一");
        t1.start();
        Thread t2=new Thread(ts1,"窗口二");
        t2.start();
        Thread t3=new Thread(ts1,"窗口三");
        t3.start();
    }
}
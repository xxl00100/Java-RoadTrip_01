package Phase2.Day24_1_ThreadSafty;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 14:08
 * @Description: Phase2.Day24_1_ThreadSafty
 * @version: 1.0
 */
public class TestSynchronized extends Thread {
    static int totalTicket=30;

    public TestSynchronized(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            synchronized (TestSynchronized.class){
                if (totalTicket>0){
                    System.out.println(this.getName()+"抢到了第"+totalTicket--+"张火车票");
                }
            }
        }
    }
}

class test{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestSynchronized ts1=new TestSynchronized("窗口一");
        ts1.start();
        TestSynchronized ts2=new TestSynchronized("窗口二");
        ts2.start();
        TestSynchronized ts3=new TestSynchronized("窗口三");
        ts3.start();

    }
}
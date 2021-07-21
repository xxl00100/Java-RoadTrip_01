package Phase2.Day22_0_ThreadPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:34
 * @Description: Phase2.Day22_0_ThreadPractice
 * @version: 1.0
 */
public class BuyTickets {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestBuyTickets tbt1=new TestBuyTickets("窗口1");
        tbt1.start();
        TestBuyTickets tbt2=new TestBuyTickets("窗口2");
        tbt2.start();
        TestBuyTickets tbt3=new TestBuyTickets("窗口3");
        tbt3.start();
    }
}

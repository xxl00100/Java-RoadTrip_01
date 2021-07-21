package Phase2.Day22_0_ThreadPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:27
 * @Description: Phase2.Day22_0_ThreadPractice
 * @version: 1.0
 */
public class TestBuyTickets extends Thread {
    static int totalTicket=10;

    public TestBuyTickets(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<100;i++){
            if (totalTicket>0){
                System.out.println("我在"+this.getName()+"抢到了第"+totalTicket+"张从北京到广州的票");
                totalTicket--;
            }

        }
    }
}

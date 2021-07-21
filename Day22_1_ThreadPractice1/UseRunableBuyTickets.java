package Phase2.Day22_1_ThreadPractice1;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:49
 * @Description: Phase2.Day22_1_ThreadPractice1
 * @version: 1.0
 */
public class UseRunableBuyTickets implements Runnable {
     int totalTicket=10;

    @Override
    public void run() {
        for (int i=1;i<100;i++){
            if(totalTicket>0){
                System.out.println("我在"+Thread.currentThread().getName()+"抢到了第"+totalTicket+"张火车票");
                totalTicket--;
            }
        }
    }
}

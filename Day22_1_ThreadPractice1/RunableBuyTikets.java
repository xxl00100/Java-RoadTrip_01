package Phase2.Day22_1_ThreadPractice1;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:52
 * @Description: Phase2.Day22_1_ThreadPractice1
 * @version: 1.0
 */
public class RunableBuyTikets {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        UseRunableBuyTickets ubt1=new UseRunableBuyTickets();
        Thread t1=new Thread(ubt1,"窗口一");
        t1.start();
//        UseRunableBuyTickets ubt2=new UseRunableBuyTickets();
        Thread t2=new Thread(ubt1,"窗口二");
        t2.start();
//        UseRunableBuyTickets ubt3=new UseRunableBuyTickets();
        Thread t3=new Thread(ubt1,"窗口三");
        t3.start();








    }
}

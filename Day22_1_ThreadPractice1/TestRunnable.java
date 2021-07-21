package Phase2.Day22_1_ThreadPractice1;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:45
 * @Description: Phase2.Day22_1_ThreadPractice1
 * @version: 1.0
 */
public class TestRunnable implements  Runnable {
    @Override
    public void run() {
        for (int i=1;i<11;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }

    }
}

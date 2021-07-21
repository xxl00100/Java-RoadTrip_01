package Phase2.Day22_1_ThreadPractice1;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:46
 * @Description: Phase2.Day22_1_ThreadPractice1
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestRunnable tr=new TestRunnable();
        Thread tt=new Thread(tr,"子线程");
        tt.start();

        for (int i=1;i<11;i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }


    }
}

package Phase2.Day22_0_ThreadPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:13
 * @Description: Phase2.Day22_0_ThreadPractice
 * @version: 1.0
 */
public class TestPracticeThread {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
/*        for (int i=11;i<21;i++){
            System.out.println("mainThread1-----"+i);
        }*/

        //创建一个子线程并启动。不能主动调用子线程的run方法，不然会被当做一个普通方法
        PracticeThread pt=new PracticeThread();
        pt.start();
        pt.setName("子线程");

        for (int i=1;i<11;i++){
            System.out.println(Thread.currentThread().getName()+"mainThread2-----"+i);
        }




    }
}

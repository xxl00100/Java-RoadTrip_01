package Phase2.Day23_1_ThreadMethods;

import Phase2.Day22_1_ThreadPractice1.Test;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 13:34
 * @Description: Phase2.Day23_1_ThreadMethods
 * @version: 1.0
 */
public class TestJoin extends Thread {
    public TestJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(this.getName()+"-----"+i);
        }
    }
}

class test1{
    //这是main方法,是程序的入口
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);

        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
            if (i==6){
                TestJoin tj=new TestJoin("子线程");
                tj.start();
                tj.join();
            }
        }
    }
}
package Phase2.Day23_0_ReviewThread;

import Phase2.Day22_2_ThreadPractice2.TestThread;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/22 - 07 - 22 - 13:10
 * @Description: Phase2.Day23_0_ReviewThread
 * @version: 1.0
 * 复习创建现成的第一种方式继承Thread
 */
public class TestThread1 extends  Thread{
    public TestThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(this.getName()+"---"+i);
        }
    }
}


class test{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TestThread1 tt1=new TestThread1("子线程");

        tt1.start();

        Thread.currentThread().setName("主线程");
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }



    }
}
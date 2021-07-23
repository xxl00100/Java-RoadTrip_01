package Phase2.Day23_1_ThreadMethods;

import Phase2.Day22_1_ThreadPractice1.Test;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 13:47
 * @Description: Phase2.Day23_1_ThreadMethods
 * @version: 1.0
 *
 * 设置伴随线程，子线程随着主线程结束之后，还会垂死挣扎一下。
 * 先设置伴随，再设置子线程启动
 * 
 */
public class Test3 extends Thread {
    public Test3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            System.out.println(this.getName()+"----"+i);
        }
    }
}


class test4{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Test3 t=new Test3("子线程");
        t.setDaemon(true);
        t.start();

        for (int i=1;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }

    }
}
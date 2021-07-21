package Phase2.Day22_2_ThreadPractice2;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:59
 * @Description: Phase2.Day22_2_ThreadPractice2
 * @version: 1.0
 */
public class TestThread implements Callable <Integer>{
    //返回一个10以内的随机数
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}

class test{
    //这是main方法,是程序的入口
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread tt=new TestThread();
        FutureTask ft=new FutureTask(tt);
        Thread t=new Thread(ft);
        t.start();
        Object o = ft.get();
        System.out.println(o);

    }
}

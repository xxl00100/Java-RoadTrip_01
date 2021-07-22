package Phase2.Day23_0_ReviewThread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/22 - 07 - 22 - 20:05
 * @Description: Phase2.Day23_0_ReviewThread
 * @version: 1.0
 */
public class TestThreadCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}

class  test3{
    //这是main方法,是程序的入口
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThreadCallable ttc=new TestThreadCallable();
        FutureTask ft=new FutureTask(ttc);
        Thread t=new Thread(ft,"子线程");
        t.start();
        System.out.println("该线程名字为："+Thread.currentThread().getName()+"，该线程返回的值为："+ft.get());
    }
}
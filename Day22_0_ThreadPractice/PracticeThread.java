package Phase2.Day22_0_ThreadPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/21 - 07 - 21 - 22:11
 * @Description: Phase2.Day22_0_ThreadPractice
 * @version: 1.0
 */
public class PracticeThread  extends Thread{
//    必须重写run方法，才能把你想做的事情放入线程中








    @Override
    public void run() {
        for (int i=1;i<11;i++){
            System.out.println(this.getName()+"SubThread-----"+i);
        }
    }
}

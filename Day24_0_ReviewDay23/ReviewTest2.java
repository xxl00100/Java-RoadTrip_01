package Phase2.Day24_0_ReviewDay23;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 13:56
 * @Description: Phase2.Day24_0_ReviewDay23
 * @version: 1.0
 */
public class ReviewTest2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i == 225) {
                Thread.currentThread().stop();
                System.out.println("线程杯结束");
            }
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}

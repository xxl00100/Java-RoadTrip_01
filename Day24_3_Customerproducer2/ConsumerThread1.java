package Phase2.Day24_3_Customerproducer2;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 16:19
 * @Description: Phase2.Day24_3_Customerproducer2
 * @version: 1.0
 */
public class ConsumerThread1 extends Thread {
    private Product1 p;

    public ConsumerThread1(Product1 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            p.getProduct();
        }
    }
}

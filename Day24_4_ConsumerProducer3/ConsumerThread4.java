package Phase2.Day24_4_ConsumerProducer3;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:03
 * @Description: Phase2.Day24_4_ConsumerProducer3
 * @version: 1.0
 */
public class ConsumerThread4 extends  Thread{
    private Product4 p;

    public ConsumerThread4(Product4 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            p.getProduct();
        }

    }
}

package Phase2.Day24_2_CustomerProducer;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 15:58
 * @Description: Phase2.Day24_2_CustomerProducer
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Product p=new Product();
        ProducerThread pt=new ProducerThread(p);

        ConsumerThread ct=new ConsumerThread(p);
        pt.start();
        ct.start();
    }
}

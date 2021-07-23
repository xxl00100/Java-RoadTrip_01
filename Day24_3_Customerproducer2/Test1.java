package Phase2.Day24_3_Customerproducer2;

import Phase2.Day24_2_CustomerProducer.ConsumerThread;
import Phase2.Day24_2_CustomerProducer.Product;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 16:21
 * @Description: Phase2.Day24_3_Customerproducer2
 * @version: 1.0
 */
public class Test1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Product1 p=new Product1();
        ProducerThread1 pt1=new ProducerThread1(p);
        ConsumerThread1 ct1=new ConsumerThread1(p);
        pt1.start();
        ct1.start();
    }
}

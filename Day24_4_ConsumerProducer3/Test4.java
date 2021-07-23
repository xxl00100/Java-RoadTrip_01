package Phase2.Day24_4_ConsumerProducer3;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:05
 * @Description: Phase2.Day24_4_ConsumerProducer3
 * @version: 1.0
 */
public class Test4 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Product4 p=new Product4();
        ProduceThread4 pt=new ProduceThread4(p);
        ConsumerThread4 ct=new ConsumerThread4(p);
        pt.start();
        ct.start();
    }
}

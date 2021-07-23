package Phase2.Day24_4_ConsumerProducer3;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 22:00
 * @Description: Phase2.Day24_4_ConsumerProducer3
 * @version: 1.0
 */
public class ProduceThread4 extends Thread {
    private Product4 p;

    public ProduceThread4(Product4 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i =1; i<=10;i++){
            if (i % 2 ==0){
                p.setProduct("费列罗","巧克力");
            }
            else {
                p.setProduct("重庆山城","啤酒");
            }

        }

    }
}

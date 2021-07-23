package Phase2.Day24_2_CustomerProducer;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 15:55
 * @Description: Phase2.Day24_2_CustomerProducer
 * @version: 1.0
 */
public class ConsumerThread extends Thread {
    private Product p;

    public ConsumerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            synchronized (Product.class){
                if (i%2==0){
                    //消费巧克力
                    System.out.println("消费了----"+this.p.getBrand()+"----"+this.p.getName());
                }
                else{
                    //消费啤酒
                    System.out.println("消费了----"+this.p.getBrand()+"----"+this.p.getName());
                }
            }





        }
    }
}

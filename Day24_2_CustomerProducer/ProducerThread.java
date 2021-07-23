package Phase2.Day24_2_CustomerProducer;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 15:48
 * @Description: Phase2.Day24_2_CustomerProducer
 * @version: 1.0
 */
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {

        for (int i=1;i<=10;i++){
           synchronized (Product.class){
               if (i%2==0){
                   //生产巧克力
                   this.p.setBrand("费列罗");
                   try {
                       Thread.sleep(100);
                   }
                   catch (Exception ex){
                       ex.printStackTrace();
                   }
                   this.p.setName("巧克力");
//                   System.out.println("生产了----"+this.p.getBrand()+"----"+this.p.getName());
               }
               else {
                   //生产啤酒
                   this.p.setBrand("青岛");
                   try {
                       Thread.sleep(100);
                   }
                   catch (Exception ex){
                       ex.printStackTrace();
                   }
                   this.p.setName("啤酒");
//                   System.out.println("生产了----"+this.p.getBrand()+"----"+this.p.getName());
               }


           }
        }
    }
}

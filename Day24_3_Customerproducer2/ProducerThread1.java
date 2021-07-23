package Phase2.Day24_3_Customerproducer2;

import Phase2.Day24_2_CustomerProducer.Product;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 16:16
 * @Description: Phase2.Day24_3_Customerproducer2
 * @version: 1.0
 */
public class ProducerThread1 extends Thread {
    private Product1 p;

    public ProducerThread1(Product1 p) {
        this.p = p;
    }

    @Override
    public void run() {

        for (int i=1;i<=10;i++){
            if (i % 2 ==0){ ////生产巧克力
                p.setProduct("费列罗","巧克力");
            }
            else{//生产啤酒
                p.setProduct("重庆","山城啤酒");
            }
        }
    }
}

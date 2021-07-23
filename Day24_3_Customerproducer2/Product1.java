package Phase2.Day24_3_Customerproducer2;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 16:12
 * @Description: Phase2.Day24_3_Customerproducer2
 * @version: 1.0
 */
public class Product1 {
    private String brand;
    private String name;
    Boolean flag=false;  //标记商品的状态,false为没有商品需要生产者生产;true为有商品,需要消费者消费

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //提供一个生产产品的同步方法
    public synchronized void  setProduct(String brand, String name){
        if (flag==true){ //如果现在有商品,就先wait,让消费者消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //不用else进行包围,生产商品
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("成功生产了:"+this.getBrand()+"---"+this.getName());
        //生产完商品之后,通知消费者过来消费,并修改商品状态为true
        flag=true;
        notify();

    }

    //提供一个产品的消费方法
    public  synchronized void getProduct(){
        if (flag==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //消费的动作不放在else里面
        System.out.println("消费了----"+this.getBrand()+"----"+this.getName());
        //消费完之后修改商品状态,并通知生产者进行生产
        flag=false;
        notify();

    }

}

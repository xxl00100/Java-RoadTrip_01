package Phase2.Day24_4_ConsumerProducer3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/23 - 07 - 23 - 21:33
 * @Description: Phase2.Day24_4_ConsumerProducer3
 * @version: 1.0
 *
 * 使用lock锁进行线程之间的通信
 */
public class Product4 {
//    1.基础属性
    private String brand;
    private String name;
    Boolean flag=false;  //是否有商品的标记,false代表没有商品,true代表有商品
//    1.1引入lock锁,并创建两个锁的等待队列
    Lock lock=new ReentrantLock();          //接口指向接口的实现类,多态
//    1.2创建等待队列
    Condition produceConditions =lock.newCondition();       //生产者等待队列
    Condition consumeConditions=lock.newCondition();        //消费者等待队列


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

//    2.提供商品的生产方法
    public void setProduct(String brand,String name){
//        2.1//打开锁,并把动作全部放到一个try中
        lock.lock();
        try {
//            2.2根据商品属性,;判断是否应该继续执行,如果有商品,那么久暂停生产,让线程等待
            if (flag==true){
                try {
                    produceConditions.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        2.3,没有商品,所以想生产,设置商品属性,并且让线程等待一段时间;
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
            System.out.println("生产了:"+this.getBrand()+"----"+this.getName());
//            2.4 生产完毕,更改商品状态,通知消费者进行消费,
            flag=true;
            consumeConditions.signal();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {       //解锁动作放入finally中,防止无法解锁的发生

            lock.unlock();

        }

//




    }



//    3.提供一个消费商品的方法
    public void getProduct(){
//        3.1先给锁住
        lock.lock();
        try { //执行动作
//            3.2判断商品状态,如果没有商品就像等待,进入消费者等待队列
            if (flag==false){
           try {
               consumeConditions.await();
           }
           catch (Exception e){
               e.printStackTrace();
           }
            }
//            3.3如果有商品,那么执行消费的动作
            System.out.println("消费了:"+this.getBrand()+"---"+this.getName());
//            3.4 更改商品状态,并通知生产者等待队列中的生产者
            flag=false;
            produceConditions.signal();
        }
        catch (Exception ex){  //处理异常
            ex.printStackTrace();
        }
        finally {//关锁
//            3.4关锁
            lock.unlock();
        }

    }



}

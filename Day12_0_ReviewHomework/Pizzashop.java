package com.Day12_0_ReviewHomework;
import java.util.Scanner;
/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 10:09
 * @Description: com.Day12_0_ReviewHomework
 * @version: 1.0
 *
 * 定义一个pizza工厂，专门生产pizza
 */
public  class Pizzashop  {


//        int input01=0;
//        定义一个静态方法，用于生产pizza
        public static  void makeAndShowPizza(){
            //想定义一个pizza父类，多态
//            Pizza p=null;
            //定义一个scanner用于取数
            Scanner sc= new Scanner(System.in);
            //下面是生产的逻辑
            System.out.print("请选择您要的披萨类型:1--培根披萨 2--水果披萨:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                   BaconPizza pizzamaker=new BaconPizza();
                    pizzamaker.setName("培根披萨");
                    System.out.print("请选择您要的披萨大小:");
                    pizzamaker.setSize(sc.nextInt());
                    System.out.print("请选择您要的披萨价格:");
                    pizzamaker.setPrice(sc.nextDouble());
                    System.out.print("请选择您要加多少克培根:");
//                    BaconPizza pizzamaker1=(BaconPizza)pizzamaker;
                    pizzamaker.setWeight(sc.nextInt());//为什么访问不到这个属性呢？
                    System.out.println(pizzamaker.showPizza());
                }
                break;
                case 2:{
                    FruitsPizza pizzamaker=new FruitsPizza();
                    pizzamaker=new FruitsPizza();
                    pizzamaker.setName("水果披萨");
                    System.out.print("请选择您要加入的水果:");

                    pizzamaker.setIngredients(sc.next()); //为什么访问不到这个属性呢？
                    System.out.print("请选择您要的披萨大小:");
                    pizzamaker.setSize(sc.nextInt());
                    System.out.print("请选择您要的披萨价格:");
                    pizzamaker.setPrice(sc.nextDouble());
                    System.out.println(pizzamaker.showPizza());
                }
                break;




            }



        }

}

package com.Day16_0_ReviewGenetics;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 13:25
 * @Description: com.Day16_0_ReviewGenetics
 * @version: 1.0
 */
public class GeneticsPractice01<E> {
    //如上定义，就生成了一个泛型类
    String str;
    int i ;
    E e;  //泛型数据类型，在实例化对象的时候可以使用
    public  void a(E e){
        //这不是一个泛型方法，因为使用的泛型类型E和该方法所在类声明的泛型E相同
    }
    public <T> void b(T t){
        //这是一个泛型方法，因为该方法的泛型类型为T，和方法所在类的泛型E不同
    }
}


class test{
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //实例化一个类对象，但是不声明该实例对象的泛型
        GeneticsPractice01 gp1=new  GeneticsPractice01();
        gp1.a(12);
        gp1.a("sbd");
        gp1.b(9.5);
        //从上面的内容可以看出，如果不声明使用的泛型，那么就默认为Object
        //下面实例化一个类对象，并且声明泛型为String
        GeneticsPractice01 <String> gp2=new  GeneticsPractice01<>();
//        gp2.a(98);
            gp2.a(":jsadfh");
            gp2.b(36);









    }
}
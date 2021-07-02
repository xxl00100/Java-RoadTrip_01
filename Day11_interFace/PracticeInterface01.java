package com.Day11_interFace;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 22:11
 * @Description: com.Day11_interFace
 * @version: 1.0
 * 体验JDK1.8之后的接口性能:从1.8之后接口中可以定义静态方法和非抽象方法
 * 定义静态方法为public static 方法名; 调用时直接接口名.静态方法名;不需要重写也不能够重写
 * 定义非抽象方法为public default 方法名--default必须有;必须进行重写,但是重写时不能出现修饰符default
 *
 */
public interface PracticeInterface01 {
    //常量
    public static final int NUM1=100;
    //抽象方法
    public abstract void a();
    public abstract void b(int a);
    //静态方法
    public static void c(){
        System.out.println("我是接口PracticeInterface01里面的静态方法c");
    }
    //非抽象方法
    public default void d(){
        System.out.println("我是接口PracticeInterface01里面的非抽象方法d");
    }
    //上面已经完成定义了接口的四种性能
}
//创建一个类用于实现接口
class Student1 implements PracticeInterface01 {


    @Override
    public void a() {
        System.out.println("我是接口PracticeInterface01里面的抽象方法a");
    }

    @Override
    public void b(int a) {
        System.out.println("我是接口PracticeInterface01里面的抽象方法b");
    }

    //重写非抽象方法
    public  void d(){
        System.out.println("我是重写了----接口PracticeInterface01的非抽象方法d");
    }


}



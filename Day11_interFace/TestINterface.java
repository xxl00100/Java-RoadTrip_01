package com.Day11_interFace;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 21:27
 * @Description: com.Day11_interFace
 * @version: 1.0
 */
public interface TestINterface {
    //1-接口是接口,类是类
//    接口没有构造器
    public static final int NUM1=10;
    public abstract void a();
    public abstract void b(int NUM1);

}

interface TestINterface02{
    public static final int NUM2=20;
    public abstract void c();
    public abstract void d(int NUM2);
}
//上面已经定义了两个接口
//下面开始定义两个类,实现两个接口,并引入继承.只能先写继承再实现接口
class Student extends Person implements TestINterface,TestINterface02{
    @Override
    public void a() {
        System.out.println("我是接口1里的a方法");
    }

    @Override
    public void b(int a) {
        System.out.println("我是接口1里的b方法");
    }

    @Override
    public void c() {
        System.out.println("我是接口2里的c方法");
    }

    @Override
    public void d(int NUM2) {
        System.out.println("我是接口2里的d方法");
    }
    //上面已经完成了两个接口的实现


}
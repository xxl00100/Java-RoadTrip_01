package com.phase5_Day28_3_Reflect;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 23:03
 * @Description: com.phase5_Day28_3_Reflect
 * @version: 1.0
 * 获取字节码的四种方式
 */
public class Test1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一:通过getClass()
        Person p1 = new Person();
        Class c1 = p1.getClass();
        System.out.println(c1);

        //方式二:通过内置class属性
        Class c2 = Person.class;
        System.out.println(c2);

        //方式三:方式一二不常用.本方式最常用
//        通过class的静态方法forName  全限定路径.类名   动态的获取
        Class c3 = Class.forName("com.phase5_Day28_3_Reflect.Person");
        System.out.println(c3);

        //方式四:了解本法.  利用类的加载器
        ClassLoader classLoader = Test1.class.getClassLoader();
        Class c4 = classLoader.loadClass("com.phase5_Day28_3_Reflect.Person");


        System.out.println("判断四个方法得到的字节码是否相等:");
        Boolean flag=false;
        if (c1==c2 && c1==c3 && c1==c4){
            flag=true;
            System.out.println("相等");
        }
        else {
            System.out.println("不相等");
        }

        System.out.println("----------------------");
            /* Class类的具体的实例：
            （1）类：外部类，内部类
            （2）接口
            （3）注解
            （4）数组
            （5）基本数据类型
            （6）void*/
        Class  p= Person.class;
        Class c = Comparable.class;


    }
}

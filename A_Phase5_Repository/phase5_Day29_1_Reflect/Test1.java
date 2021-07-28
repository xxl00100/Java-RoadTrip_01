package com.phase5_Day29_1_Reflect;

import com.phase5_Day28_3_Reflect.Person;
import com.phase5_Day28_3_Reflect.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/28 - 07 - 28 - 22:50
 * @Description: com.phase5_Day29_1_Reflect
 * @version: 1.0
 */
public class Test1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException, ClassNotFoundException {
        Class cls = Student.class;
        //根据你在方法中传入参数的不同得到指定的构造器
        Constructor c1 = cls.getConstructor();   //无参构造器/
        System.out.println(c1);
        System.out.println(cls.getConstructor(double.class, int.class));   //获取两个参数的构造器
        System.out.println("----------------获取所有非私有化的构造器,并以数组形式返回");
        Constructor[] c2 = cls.getConstructors();//
        for (Constructor c: c2){
            System.out.println(c);
        }
        System.out.println("获取所有的构造器,并以数组形式返回------");
        Constructor[] con = cls.getDeclaredConstructors();
        for (Constructor c : con){
            System.out.println(c);
        }
        System.out.println("想要获取非public修饰的内容使用getDeclaredXXX()方法即可");
        System.out.println("-----------------");
        Object o = cls.newInstance();
        System.out.println(o);

        Field[] fie = cls.getFields();
        for (Field f : fie){
            System.out.println(f);
        }
        Field name1 = cls.getField("name");
        Object o1 = cls.newInstance();

        name1.set(o1,"Mikkkkyyyyy");
        System.out.println(o1);
        System.out.println("----------============");

        Method[] m1 = cls.getMethods();
        System.out.println("获取到的所有public方法,含根基父类的方法");
        for (Method m : m1 ){
            System.out.println(m);
        }
        System.out.println("------h获取该类所有方法,包括非public");
        Method[] m2 = cls.getDeclaredMethods();
        for (Method m  : m2){
            System.out.println(m);
        }

        System.out.println("------h获取指定的方法Sleep()");
        Method s = cls.getMethod("sleep");
        System.out.println(s);


        Method sleep = cls.getMethod("sleep", int.class);
        System.out.println(sleep);
        System.out.println("获取通过class得到的方法的信息");
        System.out.println("sleep方法的名字:"+sleep.getName());
        System.out.println("sleep方法的修饰符:"+sleep.getModifiers());
        System.out.println("sleep方法的返回值:"+sleep.getReturnType());
        System.out.println("sleep方法的参数列表:");
        Class[] p = sleep.getParameterTypes();
        for (Class c : p){
            System.out.println(c);
        }

        System.out.println("diao调用方法");
        Object o2 = cls.newInstance();
        sleep.invoke(o2,8);

        Class  ss = Student.class;
        Object o3 = ss.newInstance();
        Method sleep1 = ss.getMethod("sleep", int.class);
        sleep1.invoke(o3,16);



    }
}

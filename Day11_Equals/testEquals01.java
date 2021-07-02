package com.Day11_Equals;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 15:19
 * @Description: com.Day11_Equals
 * @version: 1.0
 *
 * 新建两个对象,分别输出其内容,设置属性,并比较两个对象是否一致
 */
public class testEquals01 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Phone p1=new Phone("小米",2021,3999.99);
        Phone p2=new Phone("Apple",2020,6999.98);
        Phone p3=new Phone("小米",2021,3999.99);
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);
        System.out.println("P1和P2的比较结果:"+p1.equals(p2));
        System.out.println("P1和P3的比较结果:"+p1.equals(p3));
        System.out.println("P2和P3的比较结果:"+p2.equals(p3));
        System.out.println("我是分割线---使用instanceof----判断猫是否为手机---------");
        cat cat1=new cat();
        System.out.println(p1.equals(cat1));


    }



}

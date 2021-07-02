package com.Day11_relationsOfClass;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 16:03
 * @Description: com.Day11_relationsOfClass
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Boy b1=new Boy(35,"谢霆锋");
        Boy b2=new Boy(22,"mike");
        MOM m=new MOM();
        Girl g=new Girl(25,112.5,m);
        g.love(b1);
        g.wechat(m);
        g.love(b2);
    }


}

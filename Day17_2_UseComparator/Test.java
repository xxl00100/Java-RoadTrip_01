package com.Day17_2_UseComparator;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 9:51
 * @Description: com.Day17_2_UseComparator
 * @version: 1.0
 */
public class Test {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Person s11=new Person("lily",20,1.58);
        Person s22=(new Person("lulu",18,16.2));
        Person s33=(new Person("Mingming",18,1.35));
        Person s44=(new Person("lily",20,1.58));
        BiJiao01 bj01=new BiJiao01(); //  比较年龄
        BiJiao02 bj02 =new BiJiao02();//年龄相同的情况下，比较身高，年龄不同只比较年龄
        BiJiao03 bj03 =new BiJiao03();//比较名字
        System.out.println("逾期结果为2："+bj01.compare(s11,s22));
        System.out.println("逾期结果为1："+bj02.compare(s22,s33));
        System.out.println("逾期结果为0 ："+bj03.compare(s11,s44));



    }
}

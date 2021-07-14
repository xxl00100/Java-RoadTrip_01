package com.Day17_1_SetPractice;

import java.util.HashSet;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 8:15
 * @Description: com.Day17_1_SetPractice
 * @version: 1.0
 */
public class SetpracticeDemo1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        System.out.println("integer类型hashset");
        HashSet<Integer> hs=new HashSet<>();
        System.out.println(hs.add(19)); //ture 添加成功
        hs.add(28);
        hs.add(6);
        hs.add(33);
        System.out.println(hs.add(19));  //false 添加失败
        hs.add(-5);
        System.out.println(hs.size());  //5
        System.out.println(hs);  // [33, 19, -5, 6, 28] 无序、唯一
        System.out.println("String类型hashset======================================");
        HashSet<String> hset=new HashSet<>();
        hset.add("apple");
        hset.add("banana");
        hset.add("css");
        hset.add("html");
        hset.add("java");
        System.out.println(hset.size());
        System.out.println(hset);
        System.out.println("自定义类型hashset======================================");
        HashSet<Student> haset=new HashSet<>();
        haset.add(new Student("lily",20,1.58));
        haset.add(new Student("lulu",18,1.62));
        haset.add(new Student("Mingming",15,1.35));
        haset.add(new Student("lily",20,1.58));
        haset.add(new Student("xiaoMao",8,1.1));
        System.out.println(haset.size());  //5  发现重复的lily都被添加进去了
        System.out.println(haset);
//        忘了重写Student 的toString 方法
//      添加了重复的Lily，原因在于自定义类型默认通过地址来判断是否为同一个对象
//        解决办法就是通过重写比较器来明确以什么为对比的依据；
//        分为内部比较器和外部比较器两种，推荐使用外部比较器，因为健壮性好









    }
}

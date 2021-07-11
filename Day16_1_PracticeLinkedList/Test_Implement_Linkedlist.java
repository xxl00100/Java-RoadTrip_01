package com.Day16_1_PracticeLinkedList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 16:17
 * @Description: com.Day16_1_PracticeLinkedList
 * @version: 1.0
 */
public class Test_Implement_Linkedlist {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Implement_Linkedlist mylist=new Implement_Linkedlist();
        mylist.add("AAA");
        mylist.add("BBB");
        mylist.add("CCC");
        mylist.add("DDD");
        System.out.println(mylist.toString());
        System.out.println("我自己实现的集合长度为："+mylist.size());
        System.out.println("我自己实现的集合索引为0的值为："+mylist.get(0));
        System.out.println("我自己实现的集合索引为1的值为："+mylist.get(1));
        System.out.println("我自己实现的集合索引为2的值为："+mylist.get(2));
        System.out.println("我自己实现的集合索引为3的值为："+mylist.get(3));

    }
}

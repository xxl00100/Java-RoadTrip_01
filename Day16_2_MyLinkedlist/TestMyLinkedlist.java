package com.Day16_2_MyLinkedlist;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 21:50
 * @Description: com.Day16_2_MyLinkedlist
 * @version: 1.0
 */
public class TestMyLinkedlist {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        MyLinkedlist mylist=new MyLinkedlist();
        mylist.add(56);
        mylist.add(22);
        mylist.add(58);
        mylist.add(67);
        mylist.add("sdf");
        mylist.add("AAA");
        mylist.size();
        System.out.println("使用普通for+get方法进行遍历：");
        for(int i=0;i<mylist.count;i++){
            System.out.println("第"+i+"个元素内容为:"+mylist.get(i));

        }
        System.out.println("使用重写的toString进行遍历：");
        System.out.println(mylist.toString());





    }

}

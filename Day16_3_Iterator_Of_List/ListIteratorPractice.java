package com.Day16_3_Iterator_Of_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 22:20
 * @Description: com.Day16_3_Iterator_Of_List
 * @version: 1.0
 */
public class ListIteratorPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("ffff");
        System.out.println("原来的list集合:"+list);
        //计划在ccc后面插入一个666
/*        Iterator it=list.iterator();
        while (it.hasNext()){
            if ("cccc".equals(it.hasNext())){
                list.add("666");
            }
        }*/
//上面的多行注释报错，发生并发修改异常，原因在于iterator在操作list，同时又使用add进行操作，就搞不清楚了
//        解决办法，让同一个人进行操作就行，listIterator就能行
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            if ("cccc".equals(it.next())){
                it.add("66666");   //list.add("66666");如果这样写依旧是两个人操作，依旧发生并发修改异常
            }
        }
        System.out.println(list);
        //经过上面的while循环，指针已经到了最后一个元素，还可以使用listIterator的hasPrevious方法翻过来遍历
        System.out.println("使用hasPrevious反过来遍历-------------");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }


    }

}

package com.Day17_0_ReviewIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 7:50
 * @Description: com.Day17_0_ReviewIterator
 * @version: 1.0
 */
public class ReviewIterator {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();//多态
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        col.add("aaa");
        col.add("eee");
        System.out.println(col);
        //先来一个遍历
        System.out.println("使用Iterator遍历");
        Iterator<String > it=col.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("使用增强for遍历");
        for(String s:col){
            System.out.print(s+"\t");
        }
        System.out.println("使用listIterator同时遍历同时操作");
        ListIterator<String> ite= ((ArrayList<String>) col).listIterator();
        ArrayList list=new ArrayList();
        ListIterator<String> it1 = list.listIterator();

        while (ite.hasNext()){
            if ("ccc".equals(ite.next())){
                ite.add("6666666");
            }
            System.out.print(ite.next()+"\t");
        }
        System.out.println("指针已经到最末尾，使用listIterator的previous反向遍历");
        while (ite.hasPrevious()){
            System.out.print(ite.previous()+"\t");
        }


    }
}

package com.Day15_0_CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/9 - 07 - 09 - 21:01
 * @Description: com.Day15_0_CollectionPractice
 * @version: 1.0
 */
public class ListPractice {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        List list =new ArrayList();//多态
        list.add(15);
        list.add(18);
        list.add(158);
        list.add(-615);
        list.add("abc");
        list.add(2);
        System.out.println(list);
        list.remove(2);  //删除索引为2的元素158
        System.out.println(list);
        list.remove("abc");  //删除值为abc的元素
        System.out.println(list);
        list.set(2,88888);//将索引为2的元素的值，修改为88888
        System.out.println(list);
        System.out.println(list.get(2));//获取索引为2的那个元素值
        System.out.println("-=====================");
        System.out.println("普通for遍历list");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-=====================");
        System.out.println("增强for遍历list");
        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("-=====================");
        System.out.println("迭代器遍历list");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }


}

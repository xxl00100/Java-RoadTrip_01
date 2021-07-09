package com.Day15_0_CollectionPractice;

import java.util.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/9 - 07 - 09 - 20:35
 * @Description: com.Day15_0_CollectionPractice
 * @version: 1.0
 */
public class CollectionMethods {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //多态，创建一个collection的实现类；collection是接口无法直接创建对象
        Collection col=new ArrayList();
        //开始调用方法
        col.add(12);
        col.add(58);
        col.add(37);
        col.add(666);
        System.out.println(col.toString());
        //上面判断是否添加成功
        //下面呢使用方法和包装类创建一个新的集合；也使用多态
        List list = Arrays.asList(new Integer[]{53, 17, 18, 777, 999});
        col.addAll(list);
        System.out.println(col);
        //上面判断是否添加成功
        //使用size；ISempty方法
        System.out.println("集合的大小:"+col.size());
        System.out.println("集合是否为空:"+col.isEmpty());
        //使用清空方法
        Collection col2=col;
        Collection col3=col;
        col2.clear();
        System.out.println(col2);
        //判断remove方法
        boolean isremove = col.remove(666);
        System.out.println("是否删除成功元素666:"+isremove);
        //判断是否包含
        System.out.println("是包含元素12:"+col.contains(12));
        //使用equals
        col2.add(12);
        col2.add(58);
        col2.add(37);
        col2.add(666);
        System.out.println("col元素："+col);
        System.out.println("co2元素："+col);
        System.out.println("是否col同col2相等:"+col.equals(col2));
        System.out.println("==========================");
        System.out.println("col3元素："+col3);
        System.out.println("遍历方法1：增加for循环");
        for(Object o:col3){
            System.out.println(o);
        }
        System.out.println("遍历方法2：迭代器Iterator");
        //创建迭代器
        Iterator it= col3.iterator() ;
//        hasnext()用于判断当前位置是否有下一个值
//        next()用于获取当前的值，并把指针往后移动一个
        while (it.hasNext()){
            System.out.println(it.next());
        }
        }
    }


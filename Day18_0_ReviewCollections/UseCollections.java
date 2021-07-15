package com.Day18_0_ReviewCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/15 - 07 - 15 - 8:06
 * @Description: com.Day18_0_ReviewCollections
 * @version: 1.0
 */
public class UseCollections {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
/*        Collections cols=new Collections();
        collections工具类的构造器被private修饰，所以无法创建对象，但其方法都是静态方法，可直接类名调用*/
        ArrayList<String> list =new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println("原始的list："+list);
        Collections.addAll(list,"ee","dd","ff");
        System.out.println("使用addall方法添加单个元素后的list："+list);
        Collections.addAll(list,new String[] {"gg","ii","hh"});
        System.out.println("使用addall方法添加一个数组后的list："+list);
        Collections.sort(list);
        System.out.println("使用sort方法进行升序排序后的list："+list);
        System.out.println("使用binarySearch方法进行二分查找后的list："+Collections.binarySearch(list,"ee"));
        System.out.println("==========使用copy方法");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"WW","XX","YY","ZZ");
        System.out.println("原始list："+list);
        System.out.println("原始list2："+list2);
        Collections.copy(list,list2);
        System.out.println();
        System.out.println("copy（list，list2）之后的list："+list);
        System.out.println("copy（list，list2）之后的list2："+list2);
        System.out.println("================使用fill替换");
        System.out.println();
        System.out.println("原始list2："+list2);
        Collections.fill(list2,"TTTTT");
        System.out.println("使用fill替换list2后："+list2);







    }
}

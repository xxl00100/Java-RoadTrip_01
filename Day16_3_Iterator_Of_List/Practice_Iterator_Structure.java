package com.Day16_3_Iterator_Of_List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 22:03
 * @Description: com.Day16_3_Iterator_Of_List
 * @version: 1.0
 */
public class Practice_Iterator_Structure {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("ffff");
        //使用迭代器进行遍历
        Iterator it=list.iterator();  //在这里发一个断点，用来查看iterator的结构
        while (it.hasNext()){
            System.out.println(it.next());
        }

        }
    }


package com.Day17_4_UseTreeMao;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 16:58
 * @Description: com.Day17_4_UseTreeMao
 * @version: 1.0
 *
 * 使用map传入自定义类型的情况
 */
public class UseTreeMapp2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        TreeMap<Cat,Integer> map=new TreeMap<>(); //没有传入比较器，会默认使用内部比较器，按照年龄比较
        map.put(new Cat(19,"blili",170.5),1001);
        map.put(new Cat(18,"blili",150.5),1003);
        map.put(new Cat(19,"alili",180.5),1023);
        map.put(new Cat(17,"clili",140.5),1671);
        map.put(new Cat(10,"dlili",160.5),1891);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("使用匿名内部类制定比较器");
        TreeMap<Cat,Integer> map1=new TreeMap<>(new Comparator<Cat>() {
            @Override
//            匿名内部类制定比较器，相比较年龄，年龄不一样比较年龄，如果一样再比较体重
            public int compare(Cat o1, Cat o2) {
                if (o1.getAge()-o2.getAge()==0){
                    return (int)(o1.getWeight()-o2.getWeight());
                }
                else {
                    return o1.compareTo(o2);
                }
            }
        });
        map1.put(new Cat(19,"blili",170.5),1001);
        map1.put(new Cat(18,"blili",150.5),1003);
        map1.put(new Cat(19,"alili",180.5),1023);
        map1.put(new Cat(17,"clili",140.5),1671);
        map1.put(new Cat(10,"dlili",160.5),1891);
        map1.put(new Cat(10,"dlili",160.5),1891);
        map1.put(new Cat(10,"dlili",163.5),1891);
        System.out.println("预计数量为6："+map1.size());
        System.out.println( map1);





    }

}

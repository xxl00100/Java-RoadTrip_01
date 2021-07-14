package com.Day17_4_UseTreeMao;

import java.util.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/14 - 07 - 14 - 16:27
 * @Description: com.Day17_4_UseTreeMao
 * @version: 1.0
 */
public class UseTreeMap {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Map<String,Integer> tm=new TreeMap<>();  //多态创建一个TreeMap
        tm.put("Lily",12345);
        tm.put("Bobo",65626);
        tm.put("Mingming",98434);
        tm.put("Lulu",65813);
        tm.put("Lily",654321);
        tm.put("xiaobai",74321);
        tm.put("dabai",96873);
        System.out.println(tm.size());
        System.out.println(tm);
        System.out.println("发现Map的特点是无序，唯一");
        System.out.println(tm.containsKey("Lily"));
        System.out.println(tm.containsValue(96873));
        tm.remove("Lulu");
//        tm.clear();
        System.out.println(tm);
        System.out.println("=============");
        Map<String,Integer> map=new TreeMap<>();
        System.out.println(map.put("Lily", 12345));
        System.out.println(map.put("Bobo", 65626));
        System.out.println(map.put("Mingming", 98434));
        System.out.println(map.put("Lulu", 65813));
        System.out.println(map.put("Lily", 654321));
        System.out.println(map.put("xiaobai", 74321));
        System.out.println(map.put("dabai", 96873));
        System.out.println("dabai对应的值为："+map.get("dabai"));
        System.out.println("-------比较两个Map-------");
        System.out.println("判断是否为空："+map.isEmpty());
        System.out.println(map==tm);
        System.out.println(map.equals(tm));

        System.out.println("遍历map的key值");
        System.out.println("使用增强for遍历");
        Set<String> keys=map.keySet();
        for(String s:keys){
            System.out.println(s);
        }
        System.out.println("遍历map的value值");
        Collection <Integer> list  = map.values();
        for (Integer i:list){
            System.out.println(i);
        }

        System.out.println("遍历map的键值对");
        Set<Map.Entry<String,Integer> > entry =map.entrySet();
        for (Map.Entry<String,Integer> en:entry){
            System.out.println(en);
        }






    }

}

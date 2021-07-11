package com.Day16_0_ReviewGenetics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 13:38
 * @Description: com.Day16_0_ReviewGenetics
 * @version: 1.0
 * 练习使用通配符的泛型
 */
public class GeneticsPractice02 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        ArrayList<Object> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        //定义三个带泛型的集合，注意他们的泛型标签是同级的，无法互相赋值
/*        list1=list2；
        list1=list3；
        无法互相赋值*/

        //下面使用通配符？， 就相当于该泛型可以为任何具体的类型，相当于是父类
        ArrayList<?> lsit=new ArrayList<>();
        lsit=list1;
        lsit=list2;
        lsit=list3;
        //通过上面的代码发现，他们现在可以互相赋值了，因为存在了通配符
/*        lsit.add("adf");
        lsit.add(123);
        lsit.add(Object o);
        上面的代码都报错了，说明使用了通配符的泛型是不能直接添加元素的*/

        for(Object o:lsit){
            System.out.println(o);
        }
        //上面使用增强for循环遍历没有报错，说明使用了通配符是可以正常进行遍历的
        Object s=lsit.get(0);
//        使用get方法，然后用Object类型来接住，也没有报错嘛，说明是可以正常读取的


        //生成一个gps实例对象
        gps s1=new gps();
        s1.a(new ArrayList<Object>());
        s1.a(new ArrayList<String>());
        s1.a(new ArrayList<Integer>());
        //因为对象的a方法使用的是通配符？，所以各种泛型（标签）的集合都能够放进去



    }
}

class gps{
    //本类用于定义带有通配符的泛型方法
/*    public void a(List<Integer> list){

    }
    public void a(List<String> s){

    }
        public void a(List<?> a){

    }

    这样的定义是不行的，因为  List<Integer> list和  List<String> s 是平级关系，相当于是同样的一个参数,
    虽然标签不同，但是归根结底都是List类型，这就导致上面的两个方法重名了*/
    public void a(List<?> list){

    }



}
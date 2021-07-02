package com.Day11_relationsOfClass;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 15:54
 * @Description: com.Day11_relationsOfClass
 * @version: 1.0
 */
public class Boy {
    int age;
    String name;

    public Boy(){
        //空参构造器
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void like(){
        System.out.println("我是"+this.name+",我在谈恋爱,我要给女朋友买买买....");
    }


}

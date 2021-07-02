package com.Day11_relationsOfClass;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 15:55
 * @Description: com.Day11_relationsOfClass
 * @version: 1.0
 */
public class Girl {
    int age;
    double weight;
    MOM m;

    public void love(Boy b){
        System.out.println("我在和"+b.name+"谈恋爱"+",他今年"+b.age+"岁");
        b.like();
    }

    public void wechat(MOM m){
        System.out.println("我在和妈妈聊微信");
        m.talk();

    }

    public Girl(){
        //空参构造器
    }

    public Girl(int age, double weight, MOM m) {
        this.age = age;
        this.weight = weight;
        this.m = m;
    }
}

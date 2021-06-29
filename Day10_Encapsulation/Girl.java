package com.Day10_Encapsulation;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/30 - 06 - 30 - 0:53
 * @Description: com.Day10_Encapsulation
 * @version: 1.0
 */

//创建一个女孩类,对其年龄进行封装,提供专门的代码供外部访问

public class Girl {
    String name;
    private int age; //使用关键词private实现封装
    private int weight;
    private int salary;


    //提供设置年龄的方法,并进行一定限制.例如年龄大于30就改为18
    public void setAge(int age){
        if (age>30)
        {
            this.age=18;
        }
        else {
            this.age=age;
             }
    }
    //提供一个获取age的方法
    public int getAge(){
        return age;
    }
}

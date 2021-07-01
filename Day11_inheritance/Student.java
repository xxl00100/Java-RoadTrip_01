package com.Day11_inheritance;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 2:54
 * @Description: com.Day11_Inheritance
 * @version: 1.0
 *
 * 定义一个学生类,继承Human类, 并且设置一个特有方法,一个特有的属性
 */
public class Student extends Human{
    //设置这个类独有的属性学号
    private int sno;
    //提供访问设置方法


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //设置这个类独有的方法
    public void study(){
        System.out.println("我是自有方法,我能够在学校接受义务教育");
    }

    public Student(){
        //提供一个空参构造器,避免出错
    }

}

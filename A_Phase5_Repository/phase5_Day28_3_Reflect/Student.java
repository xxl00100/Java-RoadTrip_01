package com.phase5_Day28_3_Reflect;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 22:58
 * @Description: com.phase5_Day28_3_Reflect
 * @version: 1.0
 */
public class Student extends Person implements MyInterface{
    private int sno;   //学号
    private double height;
    protected double weight;
    public double score;

    @Override
    public void show() {
        System.out.println("我是实现的接口中的方法");
    }

    public String showInfo(){
        return "我是三好学生";
    }

    private void work(){
        System.out.println("我要从事互联网工作!!crypt");
    }

    void happy(){
        System.out.println("最重要的就是开心........");
    }

    public Student() {
    }

    private Student(int sno){
        this.sno=sno;
    }
     Student (int sno, double weight){
        this.sno=sno;
        this.weight=weight;
    }

}

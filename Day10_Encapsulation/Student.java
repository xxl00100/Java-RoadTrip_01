package com.Day10_Encapsulation;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/30 - 06 - 30 - 1:12
 * @Description: com.Day10_Encapsulation
 * @version: 1.0
 */
public class Student {

    //定义相关属性
    private String  name;
    private int  age;
    private String sex;
    //设置相关set和get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex) || "女".equals(sex)){
            this.sex = sex;
        }
        else {
            this.sex="男";
        }
    }

    //设置构造器
    public Student(){
        //空参构造器,保证不出错
    }

    public Student(String name, int age,String sex){
        this.name=name;
        this.age=age;
        this.setSex(sex);

    }

}

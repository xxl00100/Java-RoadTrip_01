package com.Day11_MethodOverrides;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 2:54
 * @Description: com.Day11_Inheritance
 * @version: 1.0
 *
 * 定义一个学生类,继承Human类, 并且设置一个特有方法,一个特有的属性
 */
public class Student extends Human {
    /*开始重写父类的吃饭方法
    * 之类对父类方法不满意,就需要重写
    *
    * */
    public void eat(){
        System.out.println("我是重写的吃饭方法,我喜欢吃小龙虾然后喝啤酒");
    }
    //重写toString方法
    public String toString(){
        return "我的名字是"+this.getName()+",今年"+this.getAge()+"岁,身高是:"+this.getHeight();
    }



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
    //由于父类human具有两个抽象方法,所以需要重写进行实现.
    public void talk(){
        System.out.println("我是学生,我能够说英文....");
    }
    public void drink(){
        System.out.println("我是学生,我不能喝酒------");
    }


}

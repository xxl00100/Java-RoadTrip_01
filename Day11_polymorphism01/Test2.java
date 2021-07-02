package com.Day11_polymorphism01;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 17:51
 * @Description: com.Day11_polymorphism01
 * @version: 1.0
 */
public class Test2 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        //创建主人
        Girl g=new Girl();
        //创建一个宠物店
        PetStore ps1=new PetStore();
        //开始获取动物
        Animal an0=new Animal();
        an0 =PetStore.getPet("猫");
        g.play(an0);
        an0=ps1.getPet("狗");
        g.play(an0);
        an0=PetStore.getPet("猪");
        g.play(an0);
    }

}

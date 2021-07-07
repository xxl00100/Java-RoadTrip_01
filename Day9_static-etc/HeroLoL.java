package com.Other_Practices;

/**
 * @Auther: XXL00100
 * @Date: 2021/6/28 - 06 - 28 - 15:54
 * @Description: com.Other_Practices
 * @version: 1.0
 * 模拟王者,创建英雄相关的
 * LOL有很多英雄，比如盲僧，团战可以输，提莫必须死，盖伦，琴女
 * 所有这些英雄，都有一些共同的状态
 * 比如，他们都有名字，hp，护甲，移动速度等等
 * 这样我们就可以设计一种东西，叫做类，代表英雄这样一种事物
 * 类： 英雄(Hero)
 * 状态： 名字, 血量，护甲，移动速度
 * 设计出物品这种类
 * 类名：Item
 * 物品有如下属性:
 * 名字 name 类型是字符串String
 * 价格 price 类型是整型 int
 *
 * 创建(实例化)3件具体物品
 * 名称 价格
 * 血瓶 50
 * 草鞋 300
 * 长剑 350
 */
public class HeroLoL {
    String name;
    int HP;
    String weapon;
    int speed;
    //重构构造器
    public HeroLoL(){
        //只要进行构造器重载,一定要定义这个空参构造器
    }
    public HeroLoL(String name,int HP,String weapon,int speed){
        this.name=name;
        this.HP=HP;
        this.weapon=weapon;
        this.speed=speed;

    }

    //这是main方法,是程序的入口
    public static void main(String[] args) {
        HeroLoL Fly=new HeroLoL("老夫子",9999,"戒尺",60);
        HeroLoL SunCe=new HeroLoL("孙策",9999,"大铁锤",60);
        HeroLoL GongSunli=new HeroLoL("公孙离",7999,"梨花伞",80);
        System.out.println(Fly.HP);
        System.out.println(Fly.name);
        System.out.println(SunCe.name);
        System.out.println(GongSunli.weapon);
    }
}



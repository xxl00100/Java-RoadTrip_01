package com.Day12_0_ReviewHomework;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 9:59
 * @Description: com.Day12_0_ReviewHomework
 * @version: 1.0
 *
 * 定义一个培根披萨，继承pizza 并且拥有特殊的属性培根克数
 */
public class BaconPizza extends Pizza{
    //定义特殊属性
    private int weight;
    //提供set和get方法

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


//    重写父类的展示方法

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根克数:"+weight;

    }

    //提供一个空参构造器和四个参数的构造器

    public BaconPizza() {

    }

    public BaconPizza(int size, double price, String name, int weight) {
        super(size, price, name);
        this.weight = weight;
    }
}

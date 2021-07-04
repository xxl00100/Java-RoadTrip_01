package com.Day12_0_ReviewHomework;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 9:40
 * @Description: com.Day12_0_ReviewHomework
 * @version: 1.0
 * 定义父类Pizza，拥有名称、大小、价格三个属性
 * 拥有一个展示的方法
 *
 */
public class Pizza {
    //分别定义三个属性
    private int size;
    private double price;
    private String name;
    //提供这三个方法的set和get方法
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //上面为属性的set和get方法
    //下面开始定义pizza方法
    public String showPizza(){
        return "披萨名称:"+name+"\n"+"大小:"+size+"寸\n"+"价格:"+price+"\n";
    }

    //下面提供一个空参构造器和一个三个参数的构造器
    public Pizza() {
    }

    public Pizza(int size, double price, String name) {
        this.size = size;
        this.price = price;
        this.name = name;
    }
}

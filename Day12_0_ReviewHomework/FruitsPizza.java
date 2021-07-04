package com.Day12_0_ReviewHomework;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/4 - 07 - 04 - 10:05
 * @Description: com.Day12_0_ReviewHomework
 * @version: 1.0
 *定义一个水果披萨，继承pizza类，并且拥有特殊属性水果配料
 */
public class FruitsPizza extends Pizza {
//    定义特殊属性水果配料
    private String ingredients;
//    提供set和get方法


    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

//    提供空参构造器和四个参数的构造器


    public FruitsPizza( ) {

    }

    public FruitsPizza(int size, double price, String name, String ingredients) {
        super(size, price, name);
        this.ingredients = ingredients;
    }

//    重写父类的showPizza方法


    @Override
    public String showPizza() {
        return super.showPizza()+"\n配料水果为:"+ingredients;
    }
}

package com.Day11_Equals;

import java.util.Objects;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 15:08
 * @Description: com.Day11_Equals
 * @version: 1.0
 * 创建一个手机类,拥有三个属性;然后重写equals方法,如果三个属性都相同,就认为两个手机相同
 * 重写toString方法
 */
public class Phone {
    //定义三个属性
    private String brand;
    private  int year;
    private double price;

    //提供着三个属性的set和get方法


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //提供一个空参构造器避免出错
    public Phone(){

    }
    //提供一个三个参数的构造器
    public Phone(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    //提供一个toString方法的重写
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
/*    //开始重写equals方法
    public boolean equals(Object obj){
        //先把obj转换为手机类,不然父类找不到之类的属性
        //加一个逻辑,只有同为手机类才能比较,使用instanceof来判断
        if(obj instanceof Phone) {
             Phone otherPhone=(Phone) obj;

            if (this.getBrand() == otherPhone.getBrand() && this.getPrice() == otherPhone.getPrice() && this.getYear() == otherPhone.getYear()) {
                return true;
            }
            else return false;
        }
        else return false;
    }*/

//

//下面是从快捷键生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return year == phone.year &&
                Double.compare(phone.price, price) == 0 &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year, price);
    }
}

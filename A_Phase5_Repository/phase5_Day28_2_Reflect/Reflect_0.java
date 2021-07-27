package com.phase5_Day28_2_Reflect;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 21:52
 * @Description: com.phase5_Day28_2_Reflect
 * @version: 1.0
 *
 * 常规的方法
 */
public class Reflect_0 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        String str = "银行卡";
        if ("微信".equals(str)){
            Wechat wc = new Wechat();
            wc.payOnline();
            pay(new Wechat());
        }
        if ("支付宝".equals(str)){
            Alipay al = new Alipay();
            al.payOnline();
            pay(new Alipay());
        }
        if ("银行卡".equals(str)){
            BankCard bc = new BankCard();
            bc.payOnline();
            pay(new BankCard());
        }
    }

// 或者也可以定义静态方法
    public static void pay(Wechat wc){
        wc.payOnline();
    }

    public static void pay(Alipay ali){
        ali.payOnline();
    }

    public static void pay(BankCard bc){
        bc.payOnline();
    }





}

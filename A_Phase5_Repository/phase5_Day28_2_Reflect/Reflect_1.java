package com.phase5_Day28_2_Reflect;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 22:04
 * @Description: com.phase5_Day28_2_Reflect
 * @version: 1.0
 *
 * 使用多态的方法
 */
public class Reflect_1 {
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

    public static void pay(MTWM m){
        m.payOnline();
    }
}

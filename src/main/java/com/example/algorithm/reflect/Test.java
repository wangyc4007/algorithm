package com.example.algorithm.reflect;

import java.lang.reflect.Method;

/**
 * @author Y~chao
 * @create 2021/7/20 10:21
 * 反射练习
 */
public class Test {

    @org.junit.Test
    public void test01() {
        String str = "ZFB";
        switch (str) {
            case "ZFB":
                pay(new AliPay());
                break;
            case "WX":
                pay(new WeChat());
                break;
            case "BANKC":
                pay(new BankCard());
                break;
        }
    }

    public void pay(Mtwm mt) {
        mt.payOnline();
    }

    @org.junit.Test
    public void test02() throws Exception {
        String str = "com.example.algorithm.reflect.AliPay";
//        String str = "com.example.algorithm.reflect.WeChat";
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);

    }

}

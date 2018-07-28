package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:24
 */
public class XiaoMiPhone implements Phone {
    @Override
    public void run() {
        System.out.println("开启小米手机");
    }
}

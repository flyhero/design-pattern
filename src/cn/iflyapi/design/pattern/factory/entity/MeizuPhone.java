package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:21
 */
public class MeizuPhone implements Phone {
    @Override
    public void run() {
        System.out.println("开启魅族手机");
    }
}

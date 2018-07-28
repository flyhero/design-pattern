package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: qfwang
 * @date: 2018-07-28 上午10:21
 */
public class Meizu implements Phone {
    @Override
    public void run() {
        System.out.println("开启魅族手机");
    }
}

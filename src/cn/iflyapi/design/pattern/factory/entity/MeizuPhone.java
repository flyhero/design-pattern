package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:21
 */
public class MeizuPhone extends Phone {
    public MeizuPhone() {
        name = "魅族";
        price = 1999d;
    }

    @Override
    public void brand() {
        System.out.println("品牌：" + name + " 价格：" + price);
    }

    @Override
    public void run() {
        System.out.println("开启魅族手机");
    }
}

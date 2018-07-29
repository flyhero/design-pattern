package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:24
 */
public class XiaoMiPhone extends Phone {

    public XiaoMiPhone() {
        name = "小米";
        price = 1599d;
    }

    @Override
    public void brand() {
        System.out.println("品牌：" + name + " 价格：" + price);
    }

    @Override
    public void run() {
        System.out.println("开启小米手机");
    }
}

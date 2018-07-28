package cn.iflyapi.design.pattern.factory.abs;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午10:00
 */
public class Client {
    public static void main(String[] args) {
        IAbstractFactory meizu = new MeizuFactory();
        meizu.produceHeadset().play();
        meizu.producePhone().run();

        IAbstractFactory xiaomi = new XiaomiFactory();
        xiaomi.produceHeadset().play();
        xiaomi.producePhone().run();
    }
}

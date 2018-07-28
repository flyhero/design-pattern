package cn.iflyapi.design.pattern.factory.method;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午9:41
 */
public class Client {
    public static void main(String[] args) {
        IFactory meizu = new MeizuFactory();
        meizu.produce().run();

        IFactory xiaomi = new XiaoMiFactory();
        xiaomi.produce().run();
    }
}

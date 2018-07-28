package cn.iflyapi.design.pattern.factory.simple;

import cn.iflyapi.design.pattern.factory.entity.MeizuPhone;
import cn.iflyapi.design.pattern.factory.entity.XiaoMiPhone;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午10:03
 */
public class Client {
    public static void main(String[] args) {
        SimplePhoneFactory simplePhoneFactory = new SimplePhoneFactory();
        simplePhoneFactory.produce("xiaomi").run();
        simplePhoneFactory.produce("meizu").run();

        simplePhoneFactory.produceX(XiaoMiPhone.class).run();
        simplePhoneFactory.produceX(MeizuPhone.class).run();
    }
}

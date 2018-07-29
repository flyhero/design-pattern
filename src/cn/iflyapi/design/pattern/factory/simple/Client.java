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
        simplePhoneFactory.produce("xiaomi").brand();
        simplePhoneFactory.produce("meizu").brand();

        simplePhoneFactory.produceX(XiaoMiPhone.class).brand();
        simplePhoneFactory.produceX(MeizuPhone.class).brand();
    }
}

package cn.iflyapi.design.pattern.factory.simple;

import cn.iflyapi.design.pattern.factory.entity.Meizu;
import cn.iflyapi.design.pattern.factory.entity.Phone;
import cn.iflyapi.design.pattern.factory.entity.XiaoMi;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:26
 */
public class SimplePhoneFactory {

    /**
     * 根据不同参数生产不同实例
     *
     * @param brand
     * @return
     */
    public Phone produce(String brand) {

        Phone phone = null;
        switch (brand) {
            case "meizu":
                phone = new Meizu();
                break;
            case "xiaomi":
                phone = new XiaoMi();
                break;
            default:
                break;
        }
        return phone;
    }

    /**
     * 通过反射机制生产
     *
     * @param clazz
     * @return
     */
    public Phone produceX(Class clazz) {
        Phone phone = null;
        try {
            phone = (Phone) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return phone;
    }

    public static void main(String[] args) {
        SimplePhoneFactory simplePhoneFactory = new SimplePhoneFactory();
        simplePhoneFactory.produce("xiaomi").run();
        simplePhoneFactory.produce("meizu").run();

        simplePhoneFactory.produceX(XiaoMi.class).run();
        simplePhoneFactory.produceX(Meizu.class).run();
    }
}

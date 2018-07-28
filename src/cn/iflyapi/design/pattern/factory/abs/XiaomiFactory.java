package cn.iflyapi.design.pattern.factory.abs;

import cn.iflyapi.design.pattern.factory.entity.Headset;
import cn.iflyapi.design.pattern.factory.entity.Phone;
import cn.iflyapi.design.pattern.factory.entity.XiaoMiPhone;
import cn.iflyapi.design.pattern.factory.entity.XiaomiHeadset;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午9:58
 */
public class XiaomiFactory implements IAbstractFactory {
    @Override
    public Headset produceHeadset() {
        return new XiaomiHeadset();
    }

    @Override
    public Phone producePhone() {
        return new XiaoMiPhone();
    }
}

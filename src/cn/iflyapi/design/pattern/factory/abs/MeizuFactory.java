package cn.iflyapi.design.pattern.factory.abs;

import cn.iflyapi.design.pattern.factory.entity.Headset;
import cn.iflyapi.design.pattern.factory.entity.MeizuHeadset;
import cn.iflyapi.design.pattern.factory.entity.MeizuPhone;
import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: qfwang
 * @date: 2018-07-28 下午9:59
 */
public class MeizuFactory implements IAbstractFactory {
    @Override
    public Headset produceHeadset() {
        return new MeizuHeadset();
    }

    @Override
    public Phone producePhone() {
        return new MeizuPhone();
    }
}

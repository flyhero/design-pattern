package cn.iflyapi.design.pattern.factory.method;

import cn.iflyapi.design.pattern.factory.entity.MeizuPhone;
import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:56
 */
public class MeizuFactory implements IFactory{
    @Override
    public Phone produce() {
        return new MeizuPhone();
    }
}

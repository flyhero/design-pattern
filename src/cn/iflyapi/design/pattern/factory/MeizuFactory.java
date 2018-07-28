package cn.iflyapi.design.pattern.factory;

import cn.iflyapi.design.pattern.factory.entity.Meizu;
import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: qfwang
 * @date: 2018-07-28 上午10:56
 */
public class MeizuFactory implements IFactory{
    @Override
    public Phone produce(Class clazz) {
        return new Meizu();
    }
}

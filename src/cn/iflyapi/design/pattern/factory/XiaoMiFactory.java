package cn.iflyapi.design.pattern.factory;

import cn.iflyapi.design.pattern.factory.entity.Phone;
import cn.iflyapi.design.pattern.factory.entity.XiaoMi;

/**
 * @author: qfwang
 * @date: 2018-07-28 上午10:57
 */
public class XiaoMiFactory implements IFactory{
    @Override
    public Phone produce(Class clazz) {
        return new XiaoMi();
    }
}

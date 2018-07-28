package cn.iflyapi.design.pattern.factory.method;

import cn.iflyapi.design.pattern.factory.entity.Phone;
import cn.iflyapi.design.pattern.factory.entity.XiaoMiPhone;
import cn.iflyapi.design.pattern.factory.method.IFactory;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:57
 */
public class XiaoMiFactory implements IFactory {
    @Override
    public Phone produce() {
        return new XiaoMiPhone();
    }
}

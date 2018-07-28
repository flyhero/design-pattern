package cn.iflyapi.design.pattern.factory.method;

import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:55
 */
public interface IFactory {

    /**
     * 生产实例
     *
     * @return
     */
    Phone produce();
}

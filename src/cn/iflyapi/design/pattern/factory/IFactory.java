package cn.iflyapi.design.pattern.factory;

import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: qfwang
 * @date: 2018-07-28 上午10:55
 */
public interface IFactory {

    /**
     * 生产实例
     *
     * @param clazz
     * @return
     */
    Phone produce(Class clazz);
}

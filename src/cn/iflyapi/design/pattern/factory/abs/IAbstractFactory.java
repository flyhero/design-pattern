package cn.iflyapi.design.pattern.factory.abs;

import cn.iflyapi.design.pattern.factory.entity.Headset;
import cn.iflyapi.design.pattern.factory.entity.Phone;

/**
 * @author: qfwang
 * @date: 2018-07-28 下午9:56
 */
public interface IAbstractFactory {

    /**
     * 生产耳机
     *
     * @return
     */
    Headset produceHeadset();

    /**
     * 生产手机
     *
     * @return
     */
    Phone producePhone();
}

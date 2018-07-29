package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 上午10:20
 */
public abstract class Phone {

    public String name;

    public Double price;

    /**
     * 输出品牌
     */
    public abstract void brand();

    /**
     * 运行手机
     */
    public abstract void run();
}

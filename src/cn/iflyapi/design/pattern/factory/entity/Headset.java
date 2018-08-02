package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午9:51
 */
public abstract class Headset {

    public String name;

    public Double price;
    /**
     * 播放
     */
    public abstract void play();
}

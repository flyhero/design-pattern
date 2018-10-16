package cn.iflyapi.design.pattern.prototype;

/**
 * 神仙抽象类
 *
 * @author: flyhero
 * @date: 2018-09-25 下午7:18
 */
public interface Immortal extends Cloneable {

    /**
     * 神仙会克隆出另一个自己
     *
     * @return
     */
    Immortal clone();

}

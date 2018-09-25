package cn.iflyapi.design.pattern.prototype;

/**
 * 神仙抽象类
 *
 * @author: flyhero
 * @date: 2018-09-25 下午7:18
 */
public abstract class Immortal implements Cloneable {

    /**
     * 覆盖Object中的clone方法
     *
     * @return
     */
    @Override
    public Immortal clone() {
        Immortal prototype = null;
        try {
            prototype = (Immortal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }


}

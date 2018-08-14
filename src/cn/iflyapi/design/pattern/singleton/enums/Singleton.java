package cn.iflyapi.design.pattern.singleton.enums;

/**
 * @author: flyhero
 * @date: 2018-08-14 下午6:29
 */
public enum Singleton {
    INSTANCE;

    /**
     * 单例中的方法
     */
    public void method() {
        System.out.println("单例枚举方法");
    }
}

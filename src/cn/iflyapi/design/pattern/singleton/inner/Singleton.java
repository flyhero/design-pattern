package cn.iflyapi.design.pattern.singleton.inner;

/**
 * 静态内部类
 *
 * @author: flyhero
 * @date: 2018-08-13 下午7:23
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

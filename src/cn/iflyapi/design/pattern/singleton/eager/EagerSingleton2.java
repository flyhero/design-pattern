package cn.iflyapi.design.pattern.singleton.eager;

/**
 * 静态内部类
 *
 * @author: flyhero
 * @date: 2018-08-13 下午7:23
 */
public class EagerSingleton2 {

    private static class SingletonHolder {
        private static final EagerSingleton2 INSTANCE = new EagerSingleton2();
    }

    private EagerSingleton2() {
    }

    public static final EagerSingleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

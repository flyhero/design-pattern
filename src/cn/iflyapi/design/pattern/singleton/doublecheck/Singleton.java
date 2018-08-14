package cn.iflyapi.design.pattern.singleton.doublecheck;

/**
 * 双重校验锁
 *
 * @author: flyhero
 * @date: 2018-08-07 下午7:58
 */
public class Singleton {

    private static volatile Singleton instance;

    /**
     * 私有构造器，防止被外部实例化
     */
    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

package cn.iflyapi.design.pattern.singleton.lazy;

/**
 * 双重校验锁
 *
 * @author: flyhero
 * @date: 2018-08-07 下午7:58
 */
public class LazySingleton4 {

    private static volatile LazySingleton4 instance;

    /**
     * 私有构造器，防止被外部实例化
     */
    private LazySingleton4() {
    }

    public static LazySingleton4 getSingleton() {
        if (instance == null) {
            synchronized (LazySingleton4.class) {
                if (instance == null) {
                    instance = new LazySingleton4();
                }
            }
        }
        return instance;
    }
}

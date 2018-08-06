package cn.iflyapi.design.pattern.singleton.lazy;

/**
 * @author: flyhero
 * @date: 2018-08-06 下午2:26
 */
public class LazySingleton2 {

    private static LazySingleton2 instance = null;

    /**
     * 私有构造器，防止被外部实例化
     */
    private LazySingleton2() {
    }

    /**
     * 静态方法创建实例
     *
     * @return
     */
    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            return new LazySingleton2();
        }
        return instance;
    }
}

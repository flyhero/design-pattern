package cn.iflyapi.design.pattern.singleton.lazy;

/**
 * @author: flyhero
 * @date: 2018-08-06 下午2:17
 */
public class LazySingleton1 {

    private static LazySingleton1 instance = null;

    /**
     * 私有构造器，防止被外部实例化
     */
    private LazySingleton1() {
    }

    /**
     * 静态方法创建实例
     *
     * @return
     */
    public static LazySingleton1 getInstance() {
        if (instance == null) {
            return new LazySingleton1();
        }
        return instance;
    }
}

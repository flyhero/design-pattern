package cn.iflyapi.design.pattern.singleton.lazy;

/**
 * @author: flyhero
 * @date: 2018-08-06 下午2:26
 */
public class LazySingleton3 {

    private static LazySingleton3 instance = null;

    /**
     * 私有构造器，防止被外部实例化
     */
    private LazySingleton3() {
    }

    /**
     * 静态方法创建实例
     *
     * @return
     */
    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (instance){
                return new LazySingleton3();
            }
        }
        return instance;
    }
}

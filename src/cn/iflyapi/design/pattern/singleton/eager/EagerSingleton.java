package cn.iflyapi.design.pattern.singleton.eager;

/**
 * @author: flyhero
 * @date: 2018-08-06 下午2:26
 */
public class EagerSingleton {

    /**
     * 定义时即初始化，保证了线程安全
     */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 私有构造器，防止被外部实例化
     */
    private EagerSingleton() {
    }

    /**
     * 静态方法获取实例
     *
     * @return
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}

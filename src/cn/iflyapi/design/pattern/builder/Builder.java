package cn.iflyapi.design.pattern.builder;

/**
 * @author: flyhero
 * @date: 2018-08-29 下午7:14
 */
public interface Builder {

    /**
     * 构建骨架
     */
    void buildSkeleton();

    /**
     * 构建主板
     */
    void buildMailboard();

    /**
     * 构建电池
     */
    void buildBattery();

    /**
     * 组装结果
     *
     * @return
     */
    Robot getResult();
}

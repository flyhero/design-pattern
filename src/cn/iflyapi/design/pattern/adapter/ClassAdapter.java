package cn.iflyapi.design.pattern.adapter;

/**
 * 适配器 为了 适配 之前存在的，现在不兼容的接口
 *
 * @author: flyhero
 * @date: 2018-11-28 2:26 PM
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("开始适配不兼容的接口");
        super.specificRequest();
    }
}

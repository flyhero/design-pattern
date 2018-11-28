package cn.iflyapi.design.pattern.adapter;

/**
 * 已经存在很久的类
 *
 * @author: flyhero
 * @date: 2018-11-28 2:27 PM
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("很早的接口，可能不是否后来的需求");
    }
}

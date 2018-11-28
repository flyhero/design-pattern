package cn.iflyapi.design.pattern.adapter;

/**
 * @author: flyhero
 * @date: 2018-11-28 2:38 PM
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}

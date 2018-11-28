package cn.iflyapi.design.pattern.adapter;

/**
 * @author: flyhero
 * @date: 2018-11-28 2:34 PM
 */
public class Client {
    public static void main(String[] args) {
        Target adapter = new ClassAdapter();
        adapter.request();

        Target objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();
    }
}

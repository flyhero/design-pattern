package cn.iflyapi.design.pattern.prototype;

/**
 * @author: qfwang
 * @date: 2018-09-25 下午7:48
 */
public class Client {
    public static void main(String[] args) {
        Wukong wukong = new Wukong();
        Wukong w = (Wukong) wukong.clone();
        System.out.println(w.getWeapon());
    }
}

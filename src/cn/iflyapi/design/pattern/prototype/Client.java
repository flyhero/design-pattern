package cn.iflyapi.design.pattern.prototype;

/**
 * @author: flyhero
 * @date: 2018-09-25 下午7:48
 */
public class Client {
    public static void main(String[] args) {
        Wukong wukong = new Wukong();
        Wukong wukong2 = (Wukong) wukong.clone();

        wukong.getSkill().add("幻化术");
        System.out.println(wukong.getSkill().toString());
        System.out.println(wukong2.getSkill().toString());
    }
}

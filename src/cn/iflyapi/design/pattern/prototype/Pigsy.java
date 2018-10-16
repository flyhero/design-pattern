package cn.iflyapi.design.pattern.prototype;

/**
 * 八戒
 *
 * @author: flyhero
 * @date: 2018-09-25 下午7:43
 */
public class Pigsy implements Immortal {

    private String weapon = "九齿钉耙";

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Immortal clone() {
        Pigsy pigsy = null;
        try {
            pigsy = (Pigsy)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pigsy;
    }
}

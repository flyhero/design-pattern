package cn.iflyapi.design.pattern.prototype;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 孙悟空
 *
 * @author: flyhero
 * @date: 2018-09-25 下午7:22
 */
public class Wukong implements Immortal {

    private String weapon = "金箍棒";

    private ArrayList<String> skill = new ArrayList<>(Arrays.asList("遁地术"));

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public ArrayList<String> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<String> skill) {
        this.skill = skill;
    }

    /**
     * 克隆出另一个（浅拷贝）
     *
     * @return
     */
/*    @Override
    public Immortal clone() {
        Wukong wukong = null;
        try {
            wukong = (Wukong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return wukong;
    }*/

    /**
     * 深拷贝
     *
     * @return
     */
    @Override
    public Immortal clone() {
        Wukong wukong = null;
        try {
            wukong = (Wukong) super.clone();
            wukong.setSkill((ArrayList) wukong.getSkill().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return wukong;
    }
}

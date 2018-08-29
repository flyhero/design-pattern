package cn.iflyapi.design.pattern.builder;

/**
 * @author: flyhero
 * @date: 2018-08-29 下午7:05
 */
public class Robot {

    /**
     * 骨架
     */
    private String skeleton;

    /**
     * 主板
     */
    private String mainboard;

    /**
     * 电池
     */
    private String battery;


    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "skeleton='" + skeleton + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}

package cn.iflyapi.design.pattern.builder;

/**
 * 指挥者
 *
 * @author: flyhero
 * @date: 2018-08-29 下午7:24
 */
public class Director {

    /**
     * 生成器
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 生产机器人
     *
     * @return
     */
    public Robot build() {
        builder.buildSkeleton();
        builder.buildMailboard();
        builder.buildBattery();
        return builder.getResult();
    }

/*    public static void main(String[] args) {
        Builder builder = new RobotBuilder();
        Director director = new Director(builder);
        Robot robot = director.build();
        System.out.println(robot.toString());
    }*/
}

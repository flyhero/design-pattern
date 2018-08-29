package cn.iflyapi.design.pattern.builder;

/**
 * @author: flyhero
 * @date: 2018-08-29 下午7:22
 */
public class RobotBuilder implements Builder{

    private Robot robot = new Robot();

    @Override
    public void buildSkeleton() {
        robot.setSkeleton("构建机器骨架");
    }

    @Override
    public void buildMailboard() {
        robot.setMainboard("构建主板");
    }

    @Override
    public void buildBattery() {
        robot.setBattery("构建电池");
    }

    @Override
    public Robot getResult() {
        return this.robot;
    }
}

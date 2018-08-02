package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: flyhero
 * @date: 2018-07-28 下午9:53
 */
public class XiaomiHeadset extends Headset {
    @Override
    public void play() {
        System.out.println("小米耳机播放音乐");
    }
}

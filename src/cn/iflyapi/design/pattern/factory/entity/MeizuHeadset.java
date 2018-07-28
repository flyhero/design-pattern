package cn.iflyapi.design.pattern.factory.entity;

/**
 * @author: qfwang
 * @date: 2018-07-28 下午9:52
 */
public class MeizuHeadset implements Headset {
    @Override
    public void play() {
        System.out.println("魅族耳机播放音乐");
    }
}

package designPatterns.structureType.adapterPattern;

/**
 * @program: LifeLongLearning
 * @description 高级媒体播放器接口
 * @author: mujianwang
 * @create: 2020-10-22 11:21
 **/
public interface AdvanceMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}

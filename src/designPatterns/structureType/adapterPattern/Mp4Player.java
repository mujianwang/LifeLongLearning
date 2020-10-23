package designPatterns.structureType.adapterPattern;

/**
 * @program: LifeLongLearning
 * @description 高级媒体播放器 Mp4实体类
 * @author: mujianwang
 * @create: 2020-10-22 11:25
 **/
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //空闲
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

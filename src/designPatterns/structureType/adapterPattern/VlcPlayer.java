package designPatterns.structureType.adapterPattern;

/**
 * @program: LifeLongLearning
 * @description 高级媒体播放器 Vlc实体类
 * @author: mujianwang
 * @create: 2020-10-22 11:24
 **/
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //空闲
    }
}

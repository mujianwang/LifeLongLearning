package designPatterns.structureType.adapterPattern;

/**
 * @program: LifeLongLearning
 * @description 媒体播放器实体类, 支持不同类型音频文件播放
 * AudioPlayer 使用适配器类 MediaAdapter 传递所需的音频类型，不需要知道能播放所需格式音频的实际类
 * @author: mujianwang
 * @create: 2020-10-22 20:24
 **/
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //内置支持mp3类型音频文件的播放
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //适配器类支持其他类型音频文件的播放
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

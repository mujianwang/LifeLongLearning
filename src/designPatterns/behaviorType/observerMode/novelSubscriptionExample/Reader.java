package designPatterns.behaviorType.observerMode.novelSubscriptionExample;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: LifeLongLearning
 * @description 读者类, 实现观察者接口
 * @author: mujianwang
 * @create: 2020-09-29 14:33
 **/
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 读者订阅作者, 即加入该作者的观察者列表
     *
     * @param writerName
     */
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    /**
     * 读者取消订阅作者, 即从该作者的观察者列表移除自己
     *
     * @param writerName
     */
    public void unSubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    /**
     * 响应作者(被观察者)发布新书做出的动作
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name + "收到了" + writer.getName() + "发布新书的通知");
        }
    }
}

package designPatterns.behaviorType.observerMode.novelSubscriptionExample;

import java.util.Observable;

/**
 * @program: LifeLongLearning
 * @description 作者类, 继承被观察者类
 * @author: mujianwang
 * @create: 2020-09-29 14:42
 **/
public class Writer extends Observable {

    private String name;

    private String lastNovel;

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    /**
     * 作者发布新书, 通知所有读者
     *
     * @param novel
     */
    public void addNovel(String novel) {
        System.out.println(name + "发布新书《" + novel + "》");
        lastNovel = novel;
        setChanged();//被观察者改变自身观察标识
        notifyObservers();//通知该作者(被观察者)所有读者(观察者)
    }

    public String getName() {
        return name;
    }

    public String getLastNovel() {
        return lastNovel;
    }
}

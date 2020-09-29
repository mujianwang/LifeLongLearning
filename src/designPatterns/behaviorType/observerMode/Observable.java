package designPatterns.behaviorType.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LifeLongLearning
 * @description 被观察者, 维护一个观察者列表, 发生变化时通知所有观察者
 * @author: mujianwang
 * @create: 2020-09-29 10:58
 **/
public class Observable {

    //观察者列表, List线程不安全, 且缺少被观察者状态改变标识, 仅示例, 标准实现阅读java.util.Observable类
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param o
     */
    public void addObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 被观察者发生变化
     */
    public void changed() {
        System.out.println("被观察者发生变化");
        notifyObservers();//通知被观察者的所有观察者
    }

    /**
     * 通知被观察者的所有观察者
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

package designPatterns.behaviorType.observerMode;

/**
 * @program: LifeLongLearning
 * @description 具体观察者2
 * @author: mujianwang
 * @create: 2020-09-29 11:08
 **/
public class ConcreteObserverTwo implements Observer {

    @Override
    public void update(Observable o) {
        System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者2做出响应");
    }
}

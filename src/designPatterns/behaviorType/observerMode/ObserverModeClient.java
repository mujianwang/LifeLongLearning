package designPatterns.behaviorType.observerMode;

/**
 * @program: LifeLongLearning
 * @description 观察者模式启动客户端
 * @author: mujianwang
 * @create: 2020-09-29 11:25
 **/
public class ObserverModeClient {

    public static void main(String[] args) {

        Observable observable = new Observable();//被观察者
        observable.addObserver(new ConcreteObserverOne());//添加观察者1
        observable.addObserver(new ConcreteObserverTwo());//添加观察者2
        observable.changed();//被观察者发生变化, 并通知所有观察者
    }
}

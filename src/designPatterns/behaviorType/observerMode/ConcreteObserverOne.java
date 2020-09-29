package designPatterns.behaviorType.observerMode;

/**
 * @program: LifeLongLearning
 * @description 具体观察者1
 * @author: mujianwang
 * @create: 2020-09-29 11:05
 **/
public class ConcreteObserverOne implements Observer {

    @Override
    public void update(Observable o) {
        System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者1做出响应");
    }
}

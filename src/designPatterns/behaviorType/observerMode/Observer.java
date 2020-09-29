package designPatterns.behaviorType.observerMode;

/**
 * @program: LifeLongLearning
 * @description 观察者接口, 提供一个统一的观察者行为响应方法
 * @author: mujianwang
 * @create: 2020-09-29 10:56
 **/
public interface Observer {

    void update(Observable o);
}

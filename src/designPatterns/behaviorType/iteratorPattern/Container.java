package designPatterns.behaviorType.iteratorPattern;

/**
 * @program: LifeLongLearning
 * @description 聚合(容器)接口，创建迭代器
 * @author: mujianwang
 * @create: 2021-04-10 15:25
 **/
public interface Container {

    Iterator getIterator();
}

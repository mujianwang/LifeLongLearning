package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 抽象工厂 创建一组(多个)产品
 * @author: mujianwang
 * @create: 2020-09-05 17:00
 **/
public interface IFactory {

    IProductA createProductA();

    IProductB createProductB();
}

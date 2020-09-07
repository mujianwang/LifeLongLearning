package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 具体工厂2 此类用来创建两类产品中的2类产品
 * @author: mujianwang
 * @create: 2020-09-05 17:19
 **/
public class FactoryTwo implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public IProductB createProductB() {
        return new ProductBTwo();
    }
}

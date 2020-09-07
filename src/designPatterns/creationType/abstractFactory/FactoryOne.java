package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 具体工厂1 此类用来创建两类产品中的1类产品
 * @author: mujianwang
 * @create: 2020-09-05 17:02
 **/
public class FactoryOne implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public IProductB createProductB() {
        return new ProductBOne();
    }
}

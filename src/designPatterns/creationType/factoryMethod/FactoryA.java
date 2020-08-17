package designPatterns.creationType.factoryMethod;

/**
 * @program: LifeLongLearning
 * @description 具体工厂A
 * @author: mujianwang
 * @create: 2020-08-17 15:01
 **/
public class FactoryA implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}

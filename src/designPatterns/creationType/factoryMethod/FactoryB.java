package designPatterns.creationType.factoryMethod;

/**
 * @program: LifeLongLearning
 * @description 具体工厂A
 * @author: mujianwang
 * @create: 2020-08-17 15:02
 **/
public class FactoryB implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}

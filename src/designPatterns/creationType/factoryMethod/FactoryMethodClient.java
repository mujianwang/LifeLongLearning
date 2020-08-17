package designPatterns.creationType.factoryMethod;

/**
 * @program: LifeLongLearning
 * @description 客户端
 * @author: mujianwang
 * @create: 2020-08-17 15:07
 **/
public class FactoryMethodClient {

    public static void main(String[] args) {

        IFactory factoryA = new FactoryA();
        IProduct productA = factoryA.createProduct();
        productA.executeMethodOne();
        productA.executeMethodTwo();

        IFactory factoryB = new FactoryB();
        IProduct productB = factoryB.createProduct();
        productB.executeMethodOne();
        productB.executeMethodTwo();
    }
}

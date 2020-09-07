package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 抽象工厂模式执行客户端
 * @author: mujianwang
 * @create: 2020-09-07 17:18
 **/
public class AbstractFactoryClient {

    public static void main(String[] args) {

        FactoryOne factoryOne = new FactoryOne();
        IProductA productAOne = factoryOne.createProductA();
        IProductB productBOne = factoryOne.createProductB();
        productAOne.executeMethodA();
        productBOne.executeMethodB();

        FactoryTwo factoryTwo = new FactoryTwo();
        IProductA productATwo = factoryTwo.createProductA();
        IProductB productBTwo = factoryTwo.createProductB();
        productATwo.executeMethodA();
        productBTwo.executeMethodB();
    }
}

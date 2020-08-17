package designPatterns.creationType.factoryMethod;

/**
 * @program: LifeLongLearning
 * @description 具体产品B
 * @author: mujianwang
 * @create: 2020-08-17 14:41
 **/
public class ProductB implements IProduct {


    @Override
    public void executeMethodOne() {
        System.out.println("Method One === B");
    }

    @Override
    public void executeMethodTwo() {
        System.out.println("Method Two === B");
    }
}

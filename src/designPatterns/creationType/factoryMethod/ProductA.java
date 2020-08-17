package designPatterns.creationType.factoryMethod;

/**
 * @program: LifeLongLearning
 * @description 具体产品A
 * @author: mujianwang
 * @create: 2020-08-17 14:41
 **/
public class ProductA implements IProduct {

    @Override
    public void executeMethodOne() {
        System.out.println("Method One === A");
    }

    @Override
    public void executeMethodTwo() {
        System.out.println("Method Two === A");
    }
}

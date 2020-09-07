package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 具体产品B1
 * @author: mujianwang
 * @create: 2020-09-05 16:53
 **/
public class ProductBOne implements IProductB {

    @Override
    public void executeMethodB() {
        System.out.println("抽象产品B---具体产品B1---执行方法");
    }
}

package designPatterns.creationType.abstractFactory;

/**
 * @program: LifeLongLearning
 * @description 具体产品A1
 * @author: mujianwang
 * @create: 2020-09-05 16:48
 **/
public class ProductATwo implements IProductA {

    @Override
    public void executeMethodA() {
        System.out.println("抽象产品A---具体产品A2---执行方法");
    }
}

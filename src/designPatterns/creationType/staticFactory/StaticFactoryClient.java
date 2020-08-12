package designPatterns.creationType.staticFactory;

/**
 * @program: LifeLongLearning
 * @description 客户端
 * @author: mujianwang
 * @create: 2020-08-12 17:33
 **/
public class StaticFactoryClient {

    public static void main(String[] args) {

        //父类引用指向子类对象
        IProduct productA = ProductFactory.createProduct("A");
        productA.execute();

        IProduct productB = ProductFactory.createProduct("B");
        productB.execute();
    }
}

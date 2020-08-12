package designPatterns.creationType.staticFactory;

/**
 * @program: LifeLongLearning
 * @description 具体产品B
 * @author: mujianwang
 * @create: 2020-08-12 17:25
 **/
public class ProductB implements IProduct {

    @Override
    public void execute() {
        System.out.println("具体产品B执行方法");
    }
}

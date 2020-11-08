package designPatterns.structureType.decoratorPattern;

/**
 * @program: LifeLongLearning
 * @description 具体装饰器A
 * @author: mujianwang
 * @create: 2020-11-06 19:59
 **/
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 重写父类(装饰器抽象类)的方法，进行装饰
     */
    @Override
    public void method() {
        System.out.println("具体装饰器A对method方法进行装饰===开始");
        super.method();
        System.out.println("具体装饰器A对method方法进行装饰===结束");
    }

    /**
     * 具体装饰器A扩展方法
     */
    public void expandA() {
        System.out.println("具体装饰器A扩展方法，与被装饰类无关");
    }
}

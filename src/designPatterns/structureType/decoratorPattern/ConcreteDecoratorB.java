package designPatterns.structureType.decoratorPattern;

/**
 * @program: LifeLongLearning
 * @description 具体装饰器B
 * @author: mujianwang
 * @create: 2020-11-06 20:12
 **/
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 重写父类(装饰器抽象类)的方法，进行装饰
     */
    @Override
    public void method() {
        System.out.println("具体装饰器B对method方法进行装饰===开始");
        super.method();
        System.out.println("具体装饰器B对method方法进行装饰===结束");
    }

    /**
     * 具体装饰器B扩展方法
     */
    public void expandB() {
        System.out.println("具体装饰器B扩展方法，与被装饰类无关");
    }
}

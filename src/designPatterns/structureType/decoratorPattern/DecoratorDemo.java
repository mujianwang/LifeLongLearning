package designPatterns.structureType.decoratorPattern;

/**
 * @program: LifeLongLearning
 * @description 装饰器模式Demo
 * @author: mujianwang
 * @create: 2020-11-06 20:15
 **/
public class DecoratorDemo {

    public static void main(String[] args) {

        //待装饰接口指向具体待装饰类的引用
        Component component = new ConcreteComponent();
        //未被装饰过的原方法
        component.method();
        System.out.println("--------------------------");
        //装饰为A
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        //被A装饰过的原方法
        concreteDecoratorA.method();
        //装饰器A扩展方法
        concreteDecoratorA.expandA();
        System.out.println("--------------------------");
        //装饰为B
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        //被B装饰过的原方法
        concreteDecoratorB.method();
        //装饰器B扩展方法
        concreteDecoratorB.expandB();
        System.out.println("--------------------------");
        //装饰为A后再被装饰为B
        ConcreteDecoratorB concreteDecoratorBByA = new ConcreteDecoratorB(concreteDecoratorA);
        //双重装饰过后的原方法
        concreteDecoratorBByA.method();
        //装饰器B扩展方法
        concreteDecoratorBByA.expandB();
    }
}

package designPatterns.structureType.decoratorPattern;

/**
 * @program: LifeLongLearning
 * @description 抽象装饰器父类，为装饰器定义需要装饰的目标，内部有一个待装饰接口(抽象类)的引用
 * 抽象装饰器实现待装饰接口(或继承待装饰抽象类)，目的是为了装饰器可以再次被装饰
 * @author: mujianwang
 * @create: 2020-11-06 19:42
 **/
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 此方法一般与被装饰方法同名，内部实现为待装饰接口(抽象类)调用同名方法
     * 实际运行中，该待装饰接口(抽象类)会指向具体实现的待装饰类，所以该方法运行实际为实际待装饰类重写过的同名方法
     * 具体装饰器会重写该方法，在其基础上进行装饰
     */
    @Override
    public void method() {
        component.method();
    }
}

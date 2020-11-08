package designPatterns.structureType.decoratorPattern;

/**
 * @program: LifeLongLearning
 * @description 具体待装饰类，实现待装饰接口(或继承待装饰抽象类)
 * @author: mujianwang
 * @create: 2020-11-06 13:29
 **/
public class ConcreteComponent implements Component {

    /**
     * 待装饰方法
     */
    @Override
    public void method() {
        System.out.println("具体待装饰类，待装饰方法");
    }
}

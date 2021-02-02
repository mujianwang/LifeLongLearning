package designPatterns.creationType.prototypePattern.exmaple;

/**
 * @program: LifeLongLearning
 * @description 具体原型（Concrete Prototype）角色
 * @author: mujianwang
 * @create: 2021-02-01 19:54
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

package designPatterns.creationType.prototypePattern.exmaple;

/**
 * @program: LifeLongLearning
 * @description 具体原型（Concrete Prototype）角色
 * @author: mujianwang
 * @create: 2021-02-01 19:46
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

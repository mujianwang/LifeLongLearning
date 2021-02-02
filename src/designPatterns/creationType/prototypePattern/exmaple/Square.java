package designPatterns.creationType.prototypePattern.exmaple;

/**
 * @program: LifeLongLearning
 * @description 具体原型（Concrete Prototype）角色
 * @author: mujianwang
 * @create: 2021-02-01 19:53
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

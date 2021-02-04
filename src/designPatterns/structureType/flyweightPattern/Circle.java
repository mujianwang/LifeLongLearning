package designPatterns.structureType.flyweightPattern;

/**
 * @program: LifeLongLearning
 * @description 具体享元类
 * @author: mujianwang
 * @create: 2021-02-04 17:26
 **/
public class Circle implements Shape {

    private String color;//内部状态(共享状态)
    private int x;//外部状态(非共享状态)
    private int y;//外部状态(非共享状态)
    private int radius;//外部状态(非共享状态)

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

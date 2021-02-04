package designPatterns.structureType.flyweightPattern;

import java.util.HashMap;

/**
 * @program: LifeLongLearning
 * @description 享元工厂(单例模式版)
 * @author: mujianwang
 * @create: 2021-02-04 20:29
 **/
public class ShapeFactorySingle {

    private static final ShapeFactorySingle shapeFactorySingle = new ShapeFactorySingle();

    private HashMap<String, Shape> circleMap;

    public ShapeFactorySingle() {
        this.circleMap = new HashMap<>();
    }

    //非线程安全单例，仅示例
    public static ShapeFactorySingle getInstance() {
        return shapeFactorySingle;
    }

    public Shape getCircle(String color) {

        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

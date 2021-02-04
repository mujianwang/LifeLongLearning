package designPatterns.structureType.flyweightPattern;

import java.util.HashMap;

/**
 * @program: LifeLongLearning
 * @description 享元工厂
 * @author: mujianwang
 * @create: 2021-02-04 17:43
 **/
public class ShapeFactory {

    //静态也是全局唯一，类似单例(唯一性)，单例保证全局唯一，静态保证该变量全局唯一
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {

        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

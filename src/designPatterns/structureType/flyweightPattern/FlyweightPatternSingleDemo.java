package designPatterns.structureType.flyweightPattern;

/**
 * @program: LifeLongLearning
 * @description 客户端类(享元工厂单例版)
 * @author: mujianwang
 * @create: 2021-02-04 20:36
 **/
public class FlyweightPatternSingleDemo {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        ShapeFactorySingle shapeFactorySingle = ShapeFactorySingle.getInstance();
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) shapeFactorySingle.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

package designPatterns.creationType.prototypePattern.exmaple;

/**
 * @program: LifeLongLearning
 * @description 客户（Client）角色
 * @author: mujianwang
 * @create: 2021-02-02 10:23
 **/
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}

package designPatterns.creationType.prototypePattern;

/**
 * @program: LifeLongLearning
 * @description 普通原型模式(此处其实就是Cloneable的演示)演示类，Cloneable属于标识性接口，JVM在实际进行对象拷贝时会校验该类是否实现了Cloneable接口，
 * Cloneable接口本身并没有需要实现类实现的方法，实现类中重写的clone方法是定义在Object类中(native方法)
 * @author: mujianwang
 * @create: 2021-01-27 20:26
 **/
public class GeneralPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;

    public GeneralPrototype() {
        System.out.println("构造方法执行");//Object.clone()方法去拷贝一个对象时，构造方法是不被执行的
        this.x = 2;
        this.y = 3;
        this.z = 4;
    }

    public void change() {
        this.x = 9;
        this.y = 8;
        this.z = 7;
    }

    /**
     * 重写clone方法
     *
     * @return
     */
    @Override
    public GeneralPrototype clone() {

        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (GeneralPrototype) object;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }

    public static void main(String[] args) {
        GeneralPrototype prototype1 = new GeneralPrototype();
        prototype1.change();
        System.out.println(prototype1);
        GeneralPrototype prototype2 = prototype1.clone();//Object.clone()方法去拷贝一个对象时，构造方法是不被执行的
        System.out.println(prototype2);
    }
}

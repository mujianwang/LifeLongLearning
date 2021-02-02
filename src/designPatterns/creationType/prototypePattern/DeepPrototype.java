package designPatterns.creationType.prototypePattern;

/**
 * @program: LifeLongLearning
 * @description 深拷贝，如果要实现深度拷贝，则需要将实现了Cloneable接口并重写了clone方法的类中，
 * 所有的引用类型也全部实现Cloneable接口并重写clone方法，而且需要将引用类型的属性全部拷贝一遍，
 * 实际当中我们使用原型模式时，也可以写一个基类实现Cloneable接口重写clone方法，然后让需要具有拷贝功能的子类继承自该类，这是一种节省代码量的常用方式
 * @author: mujianwang
 * @create: 2021-02-01 17:36
 **/
public class DeepPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private FieldDeep field;

    public DeepPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field = new FieldDeep();
        this.field.setA(5);
    }

    public FieldDeep getField() {

        return field;
    }

    protected DeepPrototype clone() {

        Object object = null;
        try {
            object = super.clone();
            ((DeepPrototype) object).field = this.field.clone();//引用属性的拷贝
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (DeepPrototype) object;
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {
        DeepPrototype prototype1 = new DeepPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        DeepPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getField());
    }
}

class FieldDeep implements Cloneable {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected FieldDeep clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (FieldDeep) object;
    }
}

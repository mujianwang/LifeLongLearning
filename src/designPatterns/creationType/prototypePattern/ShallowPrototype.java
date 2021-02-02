package designPatterns.creationType.prototypePattern;

/**
 * @program: LifeLongLearning
 * @description 浅拷贝，对于clone方法，它执行的是浅拷贝，也就是说如果是引用类型的属性，则它不会进行拷贝，而是只拷贝引用
 * @author: mujianwang
 * @create: 2021-02-01 17:24
 **/
public class ShallowPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private Field field;

    public ShallowPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field = new Field();
        this.field.setA(5);
    }

    public Field getField() {
        return field;
    }

    public ShallowPrototype clone() {

        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (ShallowPrototype) object;
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {

        ShallowPrototype prototype1 = new ShallowPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField());
        ShallowPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getField());//两个原型类中的field引用指向同一个Field实例对象(浅拷贝)
    }

}

class Field {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

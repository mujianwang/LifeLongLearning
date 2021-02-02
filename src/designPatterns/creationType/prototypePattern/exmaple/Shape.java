package designPatterns.creationType.prototypePattern.exmaple;

/**
 * @program: LifeLongLearning
 * @description 一个例子，参考自https://www.runoob.com/design-pattern/prototype-pattern.html
 * 内容：创建一个抽象类 Shape 和扩展了 Shape 类的实体类。下一步是定义类 ShapeCache，该类把 shape 对象存储在一个 Hashtable 中，并在请求的时候返回它们的克隆
 * 此类充当 抽象原型(Prototype)角色
 * @author: mujianwang
 * @create: 2021-02-01 19:44
 **/
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

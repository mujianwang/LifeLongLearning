package designPatterns.structureType.proxyPattern.cglib;

/**
 * @program: LifeLongLearning
 * @description 目标对象(被代理), cglib动态代理, 被代理的对象无需实现接口
 * @author: mujianwang
 * @create: 2020-11-24 19:35
 **/
public class RealImage {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 展示图片
     */
    public void display() {
        System.out.println("展示图片 " + fileName);
    }

    /**
     * 隐藏图片
     */
    public void hide() {
        System.out.println("隐藏图片 " + fileName);
    }
}

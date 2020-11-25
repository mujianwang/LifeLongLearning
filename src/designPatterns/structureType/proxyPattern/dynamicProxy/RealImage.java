package designPatterns.structureType.proxyPattern.dynamicProxy;

/**
 * @program: LifeLongLearning
 * @description 目标对象(被代理)
 * @author: mujianwang
 * @create: 2020-11-24 19:35
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 展示图片
     */
    @Override
    public void display() {
        System.out.println("展示图片 " + fileName);
    }

    /**
     * 隐藏图片
     */
    @Override
    public void hide() {
        System.out.println("隐藏图片 " + fileName);
    }
}

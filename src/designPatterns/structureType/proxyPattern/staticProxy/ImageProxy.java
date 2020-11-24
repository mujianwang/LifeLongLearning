package designPatterns.structureType.proxyPattern.staticProxy;

/**
 * @program: LifeLongLearning
 * @description 静态代理对象, 实现与被代理对象相同接口
 * @author: mujianwang
 * @create: 2020-11-24 19:40
 **/
public class ImageProxy implements Image {

    /**
     * 代理类一般要持有一个被代理的对象的引用
     */
    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    /**
     * 展示图片
     * 代理类自己处理我们关心的方法, 比如在展示图片前检验图片格式是否正确, 展示后再进行一层渲染
     */
    @Override
    public void display() {

        System.out.println("展示前, 检验图片格式");
        image.display();
        System.out.println("展示后, 再次渲染图片");

    }

    /**
     * 隐藏图片
     * 对于我们不关心的方法，全部委托给被代理的对象处理
     */
    @Override
    public void hide() {
        image.hide();
    }
}

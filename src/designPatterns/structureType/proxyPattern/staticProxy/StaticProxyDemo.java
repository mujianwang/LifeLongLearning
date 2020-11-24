package designPatterns.structureType.proxyPattern.staticProxy;

/**
 * @program: LifeLongLearning
 * @description 静态代理模式客户端
 * @author: mujianwang
 * @create: 2020-11-24 19:50
 **/
public class StaticProxyDemo {

    public static void main(String[] args) {

        //真实被代理对象
        Image realImage = new RealImage("被代理的图片");
        //代理对象，持有一个被代理的对象的引用
//        Image imageProxy = new ImageProxy(realImage);
        ImageProxy imageProxy = new ImageProxy(realImage);
        //代理对象代理执行原对象方法，达到代理效果
        imageProxy.display();
        imageProxy.hide();
    }
}

package designPatterns.structureType.proxyPattern.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @program: LifeLongLearning
 * @description 动态代理客户端
 * @author: mujianwang
 * @create: 2020-11-24 20:42
 **/
public class DynamicProxyDemo {

    public static void main(String[] args) {

        //目标对象
        Image target = new RealImage("目标图片");
        //输出目标对象信息
        System.out.println(target.getClass());

        //生成代理对象
//        Image dynamicProxy = (Image) new ImageProxy(target).getProxy(); //这是直接将生成方法封装在事件处理器内部了
        ImageProxy imageProxy = new ImageProxy(target);
        Image dynamicProxy = (Image) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), imageProxy);
        //输出代理对象信息
        System.out.println(dynamicProxy.getClass());

        //执行代理方法
        dynamicProxy.display();
        dynamicProxy.hide();
    }
}

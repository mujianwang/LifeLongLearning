package designPatterns.structureType.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: LifeLongLearning
 * @description 动态代理对象, 实现InvocationHandler(调用处理程序)
 * @author: mujianwang
 * @create: 2020-11-24 19:40
 **/
public class ImageProxy implements InvocationHandler {

    /**
     * 代理类一般要持有一个被代理的对象的引用
     */
    private Image target;

//    private Object target; //也可以持有一个Object引用, 即可以代理任何类 ,放开该注释需要修改类中其他相关地方

    public ImageProxy(Image target) {
        this.target = target;
    }

    public void before() {
        System.out.println("在方法前做一些事，比如检验图片格式");
    }

    public void after() {
        System.out.println("在方法返回前做一些事，比如再次渲染图片");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //三个参数分别代表 1应该是生成的动态代理类(可以观察生成的动态代理类, 该参数为this) 2被代理方法 3被代理方法参数

        //只对display方法做处理, 也可去掉判断对全部方法都处理
        if (method.getName().equals("display")) {
            before();
        }

        Object result = method.invoke(target, args);

        //只对display方法做处理, 也可去掉判断对全部方法都处理
        if (method.getName().equals("display")) {
            after();
        }

        return result;
    }

    public Object getProxy() {

        //newProxyInstance方法, 返回一个指定接口的代理类实例, 该接口可以将方法调用指派到指定的调用处理程序
        //三个参数分别代表 1指定当前目标对象使用类加载器 2目标对象实现的接口的类型 3事件处理器
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}

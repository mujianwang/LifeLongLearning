package designPatterns.creationType.singleton;

/**
 * @program: LifeLongLearning
 * @description 单例模式示例
 * @author: mujianwang
 * @create: 2020-07-17 15:27
 **/
public class Singleton {

    /**
     * 静态实例
     * JVM创建对象: 1.分配内存  2.初始化构造器  3.将对象指向分配的内存地址
     * volatile关键字, 防止JVM指令重排序优化后, 2和3顺序交换, 返回一个实际未完成初始化的实例, 也保证实例状态对所有线程同步可见
     */
    private static volatile Singleton singleton;

    /**
     * 构造函数私有化
     */
    private Singleton() {
    }

    /**
     * 对外发布实例获取方法(双重检查锁)
     * 防止多线程下产生多个实例
     *
     * @return
     */
    public static Singleton getInstance() {

        //第一次检查
        if (singleton == null) {
            synchronized (Singleton.class) {
                //第二次检查
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

package designPatterns.behaviorType.observerMode.novelSubscriptionExample;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LifeLongLearning
 * @description 作者列表管理器, 可管理多个作者, 读者订阅时由作者名检索到Writer类
 * @author: mujianwang
 * @create: 2020-09-29 14:55
 **/
public class WriterManager {

    private static WriterManager writerManager;

    private Map<String, Writer> writerMap = new HashMap<>();

    /**
     * 添加作者
     *
     * @param writer
     */
    public void add(Writer writer) {
        writerMap.put(writer.getName(), writer);
    }

    /**
     * 读者订阅时由作者名检索到Writer类
     *
     * @param name
     * @return
     */
    public Writer getWriter(String name) {
        return writerMap.get(name);
    }

    //单例(非线程安全)
    private WriterManager() {
    } //构造函数私有化

    //对外开放实例获取
    public static WriterManager getInstance() {
        if (writerManager == null) {
            writerManager = new WriterManager();
        }
        return writerManager;
    }
}

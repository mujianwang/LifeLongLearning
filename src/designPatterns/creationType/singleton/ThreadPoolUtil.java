package designPatterns.creationType.singleton;

import java.util.concurrent.*;

/**
 * @program: LifeLongLearning
 * @description 单例线程池工具类
 * @author: mujianwang
 * @create: 2020-07-17 15:50
 **/
public class ThreadPoolUtil {

    /**
     * 线程池实例
     */
    private static volatile ExecutorService executor;

    /**
     * 单例定制化创建线程池
     *
     * @return
     */
    private static ExecutorService getExecutor() {
        if (executor == null) {
            synchronized (ExecutorService.class) {
                if (executor == null) {
                    executor = new ThreadPoolExecutor(10, 20,
                            6000L, TimeUnit.SECONDS,
                            new LinkedBlockingQueue<>(1000), new ThreadPoolExecutor.CallerRunsPolicy());
                }
            }
        }
        return executor;
    }

    /**
     * 异步执行任务(无返回值)
     *
     * @param thread
     */
    public static void addTask(Runnable thread) {
        getExecutor().submit(thread);
    }

    /**
     * 异步执行任务(有返回值)
     *
     * @param task
     * @param <V>
     * @return
     */
    public static <V> Future addTask(Callable<V> task) {
        return getExecutor().submit(task);
    }
}

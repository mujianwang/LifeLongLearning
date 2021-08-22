package dataStructure.queue;

public interface QQueue<T> {

    boolean isEmpty();//判断队列是否为空

    void enqueue(T data);//元素入队

    T dequeue();//出队，返回队头元素
}

package dataStructure.queue;

/**
 * 队列，底层存储方式为单链表
 *
 * @param <T>
 */
public class LinkedQueue<T> implements QQueue<T> {

    private Node<T> head, tail;//队头, 队尾

    /**
     * 默认构造函数，空队列
     */
    public LinkedQueue() {
        head = tail = null;
    }

    /**
     * 判空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    /**
     * 入队
     *
     * @param data
     */
    @Override
    public void enqueue(T data) {

        if (data == null) {
            return;
        }

        Node<T> node = new Node<>(data, null);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    /**
     * 出队
     *
     * @return
     */
    @Override
    public T dequeue() {

        if (isEmpty()) {
            return null;
        }

        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return data;
    }
}

class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
        this(null, null);
    }

}

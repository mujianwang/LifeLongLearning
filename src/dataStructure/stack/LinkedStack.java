package dataStructure.stack;

/**
 * 底层存储方式为单链表
 *
 * @param <T>
 */
public class LinkedStack<T> implements SStack<T> {

    private Node<T> top;//栈顶

    /**
     * 构造空栈
     */
    public LinkedStack() {
        this.top = null;
    }

    /**
     * 判断栈是否为空，若空则返回true
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * 入栈，空对象不能入栈
     *
     * @param data
     */
    @Override
    public void push(T data) {

        if (data != null) {
            top = new Node<>(data, top);
        }
    }

    /**
     * 出栈，返回栈顶元素，若栈空返回null
     *
     * @return
     */
    @Override
    public T pop() {

        if (top == null) {
            return null;
        }

        T data = top.data;
        top = top.next;

        return data;
    }

    /**
     * 取栈顶元素，未出栈，若栈空返回null
     *
     * @return
     */
    @Override
    public T get() {
        return top == null ? null : top.data;
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

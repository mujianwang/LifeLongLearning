package dataStructure.queue;

/**
 * (循环)队列，底层存储方式为数组
 */
public class SeqQueue<T> implements QQueue<T> {

    private Object element[];//元素数组
    private int head;//队首 默认为0
    private int tail;//队尾 默认为0，队尾指向最后一个元素的下一个节点

    /**
     * 指定容量构造函数
     *
     * @param size
     */
    public SeqQueue(int size) {
        element = new Object[Math.abs(size)];
        head = 0;
        tail = 0;
    }

    /**
     * 默认容量构造函数
     */
    public SeqQueue() {
        this(64);
    }

    /**
     * 判空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        //首尾相等，队列为空
        return head == tail;
    }

    /**
     * 入队
     *
     * @param data
     */
    @Override
    public void enqueue(Object data) {
        if (data == null) {
            return;
        }

        //tail的下一个节点为head时，表示队列满
        if (head == (tail + 1) % element.length) {
            Object temp[] = element;
            element = new Object[element.length * 2];
            int i = head, j = 0;
            //head的下一个节点为tail时，遍历完成
            while (i != tail) {
                element[j] = temp[i];
                i = (i + 1) % temp.length;
                j++;
            }
            head = 0;
            tail = j;
        }

        element[tail] = data;
        tail = (tail + 1) % element.length;
    }

    /**
     * 出队
     *
     * @return
     */
    @Override
    public T dequeue() {

        if (head == tail) {
            return null;
        }

        T data = (T) element[head];
        head = (head + 1) % element.length;

        return data;
    }

    public String toString() {
        String str = "[";
        if (!isEmpty()) {
            //先取第一个，这样第一个逗号元素前不会有逗号
            str += element[head].toString();
            int i = (head + 1) % element.length;
            while (i != tail) {
                str += "," + element[i].toString();
                i = (i + 1) % element.length;
            }
        }
        str += "]";

        return str;
    }
}

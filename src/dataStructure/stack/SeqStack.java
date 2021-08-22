package dataStructure.stack;

/**
 * 顺序存储的栈，底层存储方式为数组
 *
 * @param <T>
 */
public class SeqStack<T> implements SStack<T> {

    private Object element[];//存储数组
    private int top;//栈顶元素下标

    /**
     * 指定栈容量，构造函数
     *
     * @param size
     */
    public SeqStack(int size) {
        element = new Object[Math.abs(size)];
        top = -1;//初始值为-1，表示栈空
    }

    /**
     * 默认容量构造函数
     */
    public SeqStack() {
        this(64);
    }

    /**
     * 判空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param data
     */
    @Override
    public void push(T data) {

        if (data == null) {
            return;
        }

        if (top == element.length - 1) { //若栈满，则扩充栈容量
            Object[] temp = element;
            element = new Object[element.length * 2];
            for (int i = 0; i < temp.length; i++) {
                element[i] = temp[i];
            }
        }

        element[++top] = data;

    }

    /**
     * 出栈，返回栈顶元素，若栈空则返回null
     *
     * @return
     */
    @Override
    public T pop() {

        return isEmpty() ? null : (T) element[top--];
    }

    /**
     * 取栈顶元素，未出栈，若栈空则返回null
     *
     * @return
     */
    @Override
    public T get() {

        return isEmpty() ? null : (T) element[top];
    }
}

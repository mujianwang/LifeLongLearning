package dataStructure.stack;

/**
 * 栈接口
 */
public interface SStack<T> {

    boolean isEmpty();//判断元素是否为空

    void push(T data);//元素入栈

    T pop();//出栈，返回当前元素

    T get();//取栈顶元素，未出栈
}

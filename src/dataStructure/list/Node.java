package dataStructure.list;

/**
 * 单链表节点
 */
public class Node<T> {

    /**
     * 数据
     */
    public T data;

    /**
     * 后继节点的引用
     */
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

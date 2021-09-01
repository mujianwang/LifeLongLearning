package dataStructure.tree;

/**
 * 二叉树结点类
 *
 * @param <T>
 */
public class BinaryNode<T> {

    public T data;//数据域
    public BinaryNode left, right;//左右孩子节点

    /**
     * 构造函数
     *
     * @param data
     * @param left
     * @param right
     */
    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * 构造函数
     *
     * @param data
     */
    public BinaryNode(T data) {
        this(data, null, null);
    }

    /**
     * 构造函数
     */
    public BinaryNode() {
        this(null, null, null);
    }


}

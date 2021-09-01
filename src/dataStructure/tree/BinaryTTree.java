package dataStructure.tree;

/**
 * 二叉树接口
 */
public interface BinaryTTree<T> {

    boolean isEmpty();// 判断二叉树是否为空

    int count();// 判断二叉树的节点个数

    int height();// 返回二叉树的高度

    void preOrder();// 先序遍历二叉树(深度优先)

    void inOrder();// 中序遍历二叉树(深度优先)

    void postOrder();// 后序遍历二叉树(深度优先)

    void levelOrder();// 按层次遍历二叉树(广度优先)

    BinaryNode<T> search(T key);// 查找并返回首次出现关键字为key元素的节点

    BinaryNode<T> getParent(BinaryNode<T> node);// 返回node的父母节点

    void insertRoot(T x);// 插入元素x作为根节点

    BinaryNode<T> insertChild(BinaryNode<T> node, T x, boolean leftChild);// 插入孩子节点

    void removeChild(BinaryNode<T> p, boolean leftChild);// 删除p节点的左或右子树

    void removeAll();// 删除二叉树
}

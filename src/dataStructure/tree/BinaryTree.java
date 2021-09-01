package dataStructure.tree;

import dataStructure.queue.LinkedQueue;
import dataStructure.stack.LinkedStack;

/**
 * 二叉树实现类
 */
public class BinaryTree<T> implements BinaryTTree<T> {

    private BinaryNode<T> root;//根节点

    /**
     * 指定根节点创建二叉树
     *
     * @param node
     */
    public BinaryTree(BinaryNode<T> node) {
        root = node;
    }

    /**
     * 默认创建空二叉树
     */
    public BinaryTree() {
    }

    /**
     * 根据一维数组构建二叉树
     *
     * @param array
     */
    public BinaryTree(T[] array) {

        root = create(array, 0);
    }

    /**
     * 根据一维数组构建二叉树
     * 特性：在一维数组中，第i个节点的左孩子节点是第 2*i+1 个节点，第i个节点的右孩子节点是第 2*i+2 个节点
     *
     * @param array
     * @param i     初始值为0
     * @return
     */
    public BinaryNode<T> create(T[] array, int i) {

        if (array == null) {
            return null;
        }

        BinaryNode<T> p = null;//树(子树)的根节点

        if (i >= array.length) {//true表示上一层调用栈中的p节点已经没有孩子节点了，返回null
            return null;
        }

        p = new BinaryNode<>(array[i]);//创建节点
        p.left = create(array, 2 * i + 1);//设置左孩子
        p.right = create(array, 2 * i + 2);//设置右孩子

        return p;
    }

    /**
     * 判空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * 二叉树节点个数
     *
     * @return
     */
    @Override
    public int count() {
        return count(root);
    }

    /**
     * 返回以指定节点为根节点的子树的节点个数
     *
     * @param node
     * @return
     */
    public int count(BinaryNode<T> node) {
        if (node == null) {
            return 0;
        }

        return 1 + count(node.left) + count(node.right);
    }

    /**
     * 二叉树高度
     *
     * @return
     */
    @Override
    public int height() {
        return height(root);
    }

    /**
     * 返回以指定节点为根节点的子树的高度
     *
     * @param node
     * @return
     */
    public int height(BinaryNode<T> node) {
        if (node == null) {
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);
        return lh > rh ? 1 + lh : 1 + rh;
    }

    /**
     * 先序遍历，根左右
     */
    @Override
    public void preOrder() {
        preOrder(root);
    }

    /**
     * 先序遍历指定节点，根左右
     *
     * @param node
     */
    public void preOrder(BinaryNode<T> node) {
        if (node != null) {
            System.out.print(node.data.toString() + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 中序遍历，左根右
     */
    @Override
    public void inOrder() {
        inOrder(root);
    }

    /**
     * 中序遍历指定节点，左根右
     *
     * @param node
     */
    public void inOrder(BinaryNode<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data.toString() + " ");
            inOrder(node.right);
        }
    }

    /**
     * 后序遍历，左右根
     */
    @Override
    public void postOrder() {
        postOrder(root);
    }

    /**
     * 后序遍历指定节点，左右根
     *
     * @param node
     */
    public void postOrder(BinaryNode<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data.toString() + " ");
        }
    }

    /**
     * 按层次遍历二叉树(广度优先)
     */
    @Override
    public void levelOrder() {
        //依赖队列(先进先出)实现
        LinkedQueue<BinaryNode<T>> queue = new LinkedQueue();
        BinaryNode<T> node = root;
        while (node != null) {
            System.out.print(node.data.toString() + " ");
            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
            node = queue.dequeue();
        }
    }

    /**
     * 查找并返回首次出现关键字为key元素的节点
     *
     * @param key
     * @return
     */
    @Override
    public BinaryNode search(Object key) {
        return search(root, key);
    }

    /**
     * 在以node为根节点的子树中，查找并返回首次出现关键字为key元素的节点
     *
     * @param node
     * @param key
     * @return
     */
    public BinaryNode search(BinaryNode<T> node, Object key) {

        if (node == null || key == null) {
            return null;
        }

        if (node.data.equals(key)) {
            return node;
        }

        BinaryNode find = search(node.left, key);
        if (find == null) {
            find = search(node.right, key);
        }

        return find;
    }

    /**
     * 查找node的父节点
     *
     * @param node
     * @return
     */
    @Override
    public BinaryNode getParent(BinaryNode<T> node) {
        return getParent(root, node);
    }

    /**
     * 在以p为根节点的子树中，查找node的父节点
     *
     * @param p
     * @param node
     * @return
     */
    public BinaryNode getParent(BinaryNode<T> p, BinaryNode<T> node) {

        if (p == null || node == null) {
            return null;
        }

        if (p.left == node || p.right == node) {
            return p;
        }

        BinaryNode find = getParent(p.left, node);
        if (find == null) {
            find = getParent(p.right, node);
        }

        return find;
    }

    /**
     * 返回二叉树的广义表表示字符串
     *
     * @return
     */
    public String toGenListString() {
        return toGenListString(root);
    }

    /**
     * 返回以node为根的子树的广义表表示字符串
     *
     * @param node
     * @return
     */
    public String toGenListString(BinaryNode<T> node) {

        if (node == null) {
            return "^";//表示空节点
        }
        String str = node.data.toString();
        if (node.left != null || node.right != null) {
            str += "(" + toGenListString(node.left) + "," + toGenListString(node.right) + ")";
        }

        return str;
    }

    /**
     * 插入根节点，原根节点默认为左孩子
     *
     * @param x
     */
    @Override
    public void insertRoot(T x) {
        root = new BinaryNode<T>(x, root, null);
    }

    /**
     * 插入元素x作为p结点的孩子，若leftChild为true，插入结点作为左孩子，否则作为右孩子
     *
     * @param node
     * @param x
     * @param leftChild
     * @return
     */
    @Override
    public BinaryNode<T> insertChild(BinaryNode<T> node, T x, boolean leftChild) {

        if (node == null || x == null) {
            return null;
        }

        if (leftChild) {
            node.left = new BinaryNode<T>(x, node.left, null);
            return node.left;
        }
        node.right = new BinaryNode<T>(x, null, node.right);
        return node.right;
    }

    /**
     * 删除p节点的左或右子树,若leftChild为true,则删除左子树,否则删除右子树
     *
     * @param p
     * @param leftChild
     */
    @Override
    public void removeChild(BinaryNode<T> p, boolean leftChild) {
        if (p != null) {
            if (leftChild) {
                p.left = null;
            } else {
                p.right = null;
            }
        }
    }

    /**
     * 删除二叉树
     */
    @Override
    public void removeAll() {
        root = null;
    }

    /**
     * 先序遍历的非递归方法，根左右
     */
    public void preOrderTraverse() {

        //辅助栈
        LinkedStack<BinaryNode<T>> stack = new LinkedStack<>();
        //根节点开始遍历
        BinaryNode<T> node = root;
        //node为空且栈为空，说明遍历完成
        while (node != null || !stack.isEmpty()) {

            if (node != null) {//也可以用while循环代替if，下边的else直接放在while后执行即可
                //如果node不为空，则输出并入栈
                System.out.print(node.data.toString() + " ");
                stack.push(node);//入栈是为了出栈后再入栈该节点的右子树
                node = node.left;//先全部输出并入栈某个节点下的全部左子节点(左子节点不为空，一直循环)
            } else {
                //左孩子为空，则需要遍历该节点的右孩子，因此将节点出栈，取右孩子进入下次循环(右孩子为空则继续执行到此出栈，不为空则入栈后遍历右孩子)
                node = stack.pop();
                node = node.right;
            }
        }
    }

    /**
     * 中序遍历的非递归方法，根左右
     * 中序仍保持与先序一致的入栈出栈顺序，区别是输出值的时间变化
     * 原因：如果把根节点视为第一个左节点，先序和中序的遍历方式都是 1.入栈左节点 2.出栈左节点 3.入栈右节点
     * 区别在于先序是从根节点开始往下输出，中序则是从最左侧节点开始往上输出
     */
    public void inOrderTraverse() {

        //辅助栈
        LinkedStack<BinaryNode<T>> stack = new LinkedStack<>();
        //根节点开始遍历
        BinaryNode<T> node = root;
        //node为空且栈为空，说明遍历完成
        while (node != null || !stack.isEmpty()) {

            if (node != null) {//也可以用while循环代替if，下边的else直接放在while后执行即可
                //如果node不为空
                stack.push(node);//入栈是为了出栈后再入栈该节点的右子树
                node = node.left;//先全部输出并入栈某个节点下的全部左子节点(左子节点不为空，一直循环)
            } else {
                //左孩子为空，则需要遍历该节点的右孩子，因此将节点出栈，取右孩子进入下次循环(右孩子为空则继续执行到此出栈，不为空则入栈后遍历右孩子)
                node = stack.pop();
                System.out.print(node.data.toString() + " ");//出栈后输出值
                node = node.right;
            }
        }
    }

    /**
     * 后序遍历的非递归方法，左右根
     * 按照后序遍历的顺序，迭代方法的大体流程就是 左孩子入栈 -> 左孩子出栈 -> 右孩子入栈 -> 右孩子出栈 -> 输出父节点
     */
    public void postOrderTraverse() {

        //辅助栈
        LinkedStack<BinaryNode<T>> stack = new LinkedStack<>();
        //根节点开始遍历
        BinaryNode<T> node = root;
        //该节点用于记录某个节点的右孩子是否已经遍历过
        BinaryNode<T> pre = null;
        //node为空且栈为空，说明遍历完成
        while (node != null || !stack.isEmpty()) {
            while (node != null) {//左孩子全部入栈
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();//如果node的右孩子不为空，则node节点会出栈两次，第一次出栈，然后入栈并遍历右节点，第二次出栈，右节点已遍历完成，即node节点也遍历完成，输出node后，进入下次循环，出栈node的父节点
            if (node.right == null || node.right == pre) {
                System.out.print(node.data.toString() + " ");//左孩子已遍历，右孩子为空或已遍历后，输出node节点，符合左右根的顺序
                pre = node;//记录上一个遍历的节点
                node = null;//左孩子已遍历，右孩子为空或已遍历后，node=null进入下次循环，以执行出栈操作，输出node的父节点
            } else {//如果右孩子不为空，则先遍历右孩子
                stack.push(node);//node节点再次入栈
                node = node.right;//node指向右孩子进入下次循环，进行遍历
            }
        }
    }
}

package dataStructure.list;

/**
 * 单链表
 */
public class SingleLinkedList<T> {

    /**
     * 头节点
     */
    private Node<T> head;

    /**
     * 链表长度
     */
    private int length;

    /**
     * 队列为空时初始化头节点
     *
     * @param data
     */
    private void initHead(T data) {
        head = new Node(data, null);
        length = 1;
    }

    /**
     * 判空
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * 链表长度
     *
     * @return
     */
    public int length() {
        return length;
    }

    /**
     * 获取指定位置元素，i从0算起
     *
     * @param i
     * @return
     */
    public T get(int i) {

        if (i < 0 || isEmpty()) {
            return null;
        }

        Node<T> point = head;
        for (int j = 0; point != null && j < i; j++) {
            point = point.next;
        }

        if (point != null) {
            return point.data;
        }

        return null;
    }

    /**
     * 设置指定位置元素，i从0算起
     *
     * @param i
     * @param data
     */
    public void set(int i, T data) {

        if (isEmpty()) {
            return;
        }

        //i边界判断，data非空
        if (i < 0 || data == null) {
            return;
        }

        Node<T> point = head;

        //确定位置
        for (int j = 0; point != null && j < i; j++) {
            point = point.next;
        }
        //修改节点
        if (point != null) {
            point.data = data;
        }
    }

    /**
     * 将节点添加到指定位置，i从0算起
     *
     * @param i
     * @param data
     */
    public void insert(int i, T data) {

        //i边界判断，data非空
        if (i < 0 || data == null) {
            return;
        }

        //i为0，即插入头节点特殊处理
        if (i == 0) {
            if (isEmpty()) {
                initHead(data);
                return;
            } else {
                head = new Node<>(data, head);
                length++;
                return;
            }
        }

        Node<T> point = head;

        //确定位置，找到第i-1个节点，或者最后一个节点
        for (int j = 0; point.next != null && j < i - 1; j++) {
            point = point.next;
        }
        //插入节点
        if (point != null) {
            point.next = new Node<>(data, point.next);
            length++;
        }
    }

    /**
     * 链表插入尾节点
     *
     * @param data
     */
    public void append(T data) {

        if (data == null) {
            return;
        }

        if (isEmpty()) {
            initHead(data);
            return;
        }

        Node<T> point = head;
        while (point.next != null) {
            point = point.next;
        }
        point.next = new Node<>(data, null);

        length++;
    }

    /**
     * 删除指定位置的节点，返回被删除的节点
     *
     * @param i
     */
    public T remove(int i) {

        //i边界判断
        if (i < 0 || isEmpty()) {
            return null;
        }

        //头节点特殊处理
        if (i == 0) {
            T data = head.data;
            head = head.next;
            length--;
            return data;
        }

        Node<T> point = head;

        //确定位置，找到第i-1个节点，或最后一个节点
        for (int j = 0; point.next != null && j < i - 1; j++) {
            point = point.next;
        }
        //删除节点
        if (point.next != null) {
            T data = point.next.data;
            point.next = point.next.next;
            length--;
            return data;
        }

        return null;
    }

    /**
     * 删除首次出现值为data的节点
     *
     * @param data
     */
    public void remove(T data) {

        if (data == null) {
            return;
        }

        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            length--;
        }

        Node<T> point = head;
        Node<T> front = head;
        while (point != null && !point.data.equals(data)) {
            front = point;
            point = point.next;
        }

        if (point != null) {
            front.next = point.next;
            length--;
        }
    }

    /**
     * 删除全部，GC回收
     */
    public void removeAll() {
        head = null;
        length = 0;
    }

    /**
     * 查找首次出现值为data的节点，返回查找到的节点
     *
     * @param data
     * @return
     */
    public T search(T data) {

        if (data == null) {
            return null;
        }

        Node<T> point = head;
        while (point != null) {
            if (point.data.equals(data)) {
                return point.data;
            }
            point = point.next;
        }

        return null;
    }

    /**
     * 判断元素是否在链表中
     *
     * @param data
     * @return
     */
    public boolean contain(T data) {
        return search(data) != null;
    }

    /**
     * toString
     *
     * @return
     */
    public String toString() {

        String str = "[";

        Node<T> point = head;
        while (point != null) {
            str += point.data.toString();
            point = point.next;
            if (point != null) {
                str += ",";
            }
        }
        str += "]";

        return str;
    }
}

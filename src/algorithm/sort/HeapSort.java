package algorithm.sort;

/**
 * 选择排序，堆排序
 */
public class HeapSort {

    /**
     * 堆排序
     *
     * @param array
     */
    public static void heapSort(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        int length = array.length;

        //数组初始化构建大顶堆
        buildMaxHeap(array, length);

        //堆排序，即每次将堆顶元素与末尾元素交换，即每次产生一个最大值，然后剩余的元素重新构建大顶堆，循环执行
        for (int i = length - 1; i >= 0; i--) {
            //交换堆顶和末尾元素
            swap(array, 0, i);
            //数组长度减一后重建大顶堆，因为最后一位元素已不需要参与
            length--;
            //剩余元素重建大顶堆
            heapify(array, 0, length);
        }

    }

    /**
     * 构建大顶堆
     *
     * @param array
     * @param length
     */
    public static void buildMaxHeap(int[] array, int length) {

        //最后一个有孩子节点的下标
        int lastParent = (length - 2) / 2;
        for (int i = lastParent; i >= 0; i--) {
            heapify(array, i, length);
        }
    }

    /**
     * 从元素i往下递归构建大顶堆
     *
     * @param array
     * @param i
     * @param length
     */
    public static void heapify(int[] array, int i, int length) {

        //左右孩子的下标
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //i与两个孩子的最大值初始化为i，后续比进行较交换
        int largest = i;

        //判断left < length 和 right < length，防止i为叶子节点时下标越界
        //当左孩子的值大于父节点时，largest赋值为左孩子
        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        //当右孩子的值大于父节点时，largest赋值为右孩子
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        //如果父节点小于左右孩子，则交换值
        if (largest != i) {
            //交换元素
            swap(array, i, largest);
            //发生交换后，原来的父节点被放在新的位置，此时该父节点往下不一定满足大顶堆的定义，需要继续递归建堆
            heapify(array, largest, length);
        }
    }

    /**
     * 交换元素
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        heapSort(array);
        System.out.println();
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

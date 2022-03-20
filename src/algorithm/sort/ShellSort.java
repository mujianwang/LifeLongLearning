package algorithm.sort;

/**
 * 插入排序，希尔排序
 */
public class ShellSort {

    /**
     * 插入排序，希尔排序
     * 分组多次直接插入排序，也可以叫作缩减增量排序
     * 时间复杂度和gap序列有关
     */
    public static void shellSort(int[] array) {

        //初始增量 gap = array.length / 2, 缩小增量 gap /= 2
        //gap循环，分组直接插入排序，直到gap为1，即所有元素进行一次直接插入排序
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //直接插入排序
            //下标gap之前的元素，是各个组的第一个元素，进行直接插入排序时没有遍历的意义，所以从gap开始
            for (int i = gap; i < array.length; i++) {
                int tmp = array[i];
                int j;
                for (j = i; j >= gap && tmp < array[j - gap]; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        shellSort(array);
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

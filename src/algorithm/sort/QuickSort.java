package algorithm.sort;

/**
 * 交换排序，快速排序
 */
public class QuickSort {

    /**
     * 快速排序
     * 从小到大排序
     *
     * @param array
     */
    public static void quickSort(int[] array, int left, int right) {

        if (array == null || array.length < 2) {
            return;
        }

        if (left > right) {
            return;
        }

        int i = left;
        int j = right;

        //选取第一个元素作为基准数据
        int base = array[left];

        //循环遍历判断并交换，使大于和小于基准数据的元素分到左右两边
        while (i < j) {

            /**
             * base为第一个元素
             * 为什么先从右往左开始查找
             * 因为外层循环终止的条件是i=j，然后把base和index=i(j)的元素进行交换，因此index=i的值必须小于base
             * 1.先从左往右，最终i=j时，index=i的元素是大于base的
             * 1.详解：先从左往右，j不动，i移动，i停下的位置元素一定大于base，i和j交换完成后的j一定大于base，
             * 最终不论i向j移动还是j向i移动，直至相等，index=i时的元素一定大于base；
             * 2.先从右往左，最终i=j时，index=i的元素时小于base的
             * 2.详解：先从右往左，i不动，j移动，j停下的位置元素一定小于base，i和j交换完成后的i一定小于base，
             * 最终不论i向j移动还是j向i移动，直至相等，index=i时的元素一定小于base；
             * 写个示例在本上画一下就很清晰了
             */

            //从右往左查找，直至找到小于base的元素，等于base不移动
            while (i < j && array[j] >= base) {
                j--;
            }

            //从左往右查找，直到找到大于base的元素，等于base不移动
            while (i < j && array[i] <= base) {
                i++;
            }

            //i!=j，则交换两元素位置，继续遍历
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //将基准数放在i的位置，即交换基准数据和i元素
        array[left] = array[i];
        array[i] = base;

        //递归排序基准数据两侧的元素
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        quickSort(array, 0, array.length - 1);
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

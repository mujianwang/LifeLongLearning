package algorithm.sort;

/**
 * 归并排序
 * 时间复杂度
 * 假设处理的数据规模大小为 N
 * 运行时间设为：T(N)
 * ① 当把 N 分为两半时，那么处理大小为 N/2 子数组花费时间为：T(N/2)
 * ② 合并花费时间与数据规模成正比:N
 * 所以处理规模大小为N的数据所需要花费两个大小为 N/2 的子数组加上合并花费的时间
 * 即：T(N) = 2T(N/2) + N
 * 对于 N = 1，T(1) = 1
 * 求出，T(N)=N+N*log^N = O(N*logN)
 */
public class MergeSort {

    /**
     * 归并排序，分治法，先分后合
     * 递归方式
     */
    public static void mergeSort(int[] array, int left, int right) {

        //拆分数组，当left=right时，表示只有一个元素，不用再拆分
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(array, left, center);
            mergeSort(array, center + 1, right);
            merge(array, left, center, right);
        }
    }

    /**
     * 合并
     */
    public static void merge(int[] array, int left, int center, int right) {
        //合并数组，left到center为一个数组，center+1到right为一个数组
        int i = left;
        int j = center + 1;

        //一共循环right-left遍，目的是合并两个被拆分的数组到一个新的临时数组
        int[] temp = new int[right - left + 1];
        int k = 0;
        while (i <= center && j <= right) {
            if (array[i] > array[j]) {
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
            }
        }
        while (i <= center) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }

        //把临时数组复制到原数组
        for (int n = 0; n < temp.length; n++) {
            array[left++] = temp[n];
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        mergeSort(array, 0, array.length - 1);
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

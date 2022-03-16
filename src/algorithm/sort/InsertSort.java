package algorithm.sort;

/**
 * 插入排序
 */
public class InsertSort {

    /**
     * 插入排序，直接插入排序
     * 时间复杂度：O(N^2)
     *
     * @param array
     */
    public static void insertSort(int[] array) {

        //嵌套循环
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//暂存当前待排序元素
            int j;//待排序元素最终插入位置
            //j初始值取i, 所以j > 0, 无需取数据首元素, 因为比较的是tmp和j - 1, j = 1时首元素已被比较(移动)
            for (j = i; j > 0 && array[j - 1] > tmp; j--) {
                array[j] = array[j - 1];//向后移动一位
            }
            //插入完成
            array[j] = tmp;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        insertSort(array);
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

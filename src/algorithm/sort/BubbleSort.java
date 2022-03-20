package algorithm.sort;

/**
 * 交换排序，冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        //循环n次，每次确定一个最大元素在数组最右端
        for (int i = 0; i < array.length; i++) {
            //循环n-i-1次，-1是因为[j]和[j+1]比较交换，所以j最大值为n-i-1即可，n-i的元素同样会被计算
            for (int j = 0; j < array.length - i - 1; j++) {
                //前大于后则交换
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        bubbleSort(array);
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

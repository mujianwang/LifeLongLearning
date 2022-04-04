package algorithm.sort;

/**
 * 选择排序，选择排序
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectSort(int array[]) {

        if (array == null || array.length < 2) {
            return;
        }

        //循环length-1次，最后一个元素不用选择，肯定是最大值
        for (int i = 0; i < array.length - 1; i++) {

            //找到剩余元素中的最小值，放在已排序元素的末尾，即交换min和i
            int min = i;
            for (int j = i; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{34, 8, 64, 51, 32, 21};
        System.out.println("排序前===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        selectSort(array);
        System.out.println();
        System.out.println("排序后===");
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}

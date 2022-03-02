package algorithm.find;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 二分查找(递归)
     *
     * @param array 有序数组
     * @param left
     * @param right
     * @param key   查找元素
     * @return
     */
    public static int binarySearchRecursion(int[] array, int left, int right, int key) {

        if (array.length == 0) {
            return -1;
        }

        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == key) {
            return middle;
        }

        if (array[middle] > key) {
            return binarySearchRecursion(array, left, middle - 1, key);
        } else {
            return binarySearchRecursion(array, middle + 1, right, key);
        }
    }

    /**
     * 二分查找(循环)
     *
     * @param array
     * @param left
     * @param right
     * @param key
     * @return
     */
    public static int binarySearchCycle(int[] array, int left, int right, int key) {

        if (array.length == 0) {
            return -1;
        }

        if (left > right) {
            return -1;
        }

        int middle = -1;
        while (left <= right) {

            middle = (left + right) / 2;
            if (array[middle] == key) {
                break;
            }
            if (array[middle] > key) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return middle;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 6, 8, 9};
        int key = 6;
        int index1 = binarySearchRecursion(array, 0, array.length - 1, key);
        System.out.println("(recursion) key index : " + index1);
        int index2 = binarySearchCycle(array, 0, array.length - 1, key);
        System.out.println("(cycle) key index : " + index2);

    }
}

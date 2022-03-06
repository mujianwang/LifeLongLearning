package algorithm.leetcode;

/**
 * leetcode, 剑指offer 13. 机器人的运动范围
 */
public class RobotMovingCount {

    public static void main(String[] args) {

        System.out.println(movingCount(2, 3, 1));

    }

    /**
     * 机器人的运动范围
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    public static int movingCount(int m, int n, int k) {

        boolean[][] visited = new boolean[m][n];
        return movingCountCore(0, 0, m, n, k, visited);
    }

    /**
     * 机器人的运动范围核心方法，递归，深度遍历dfs
     *
     * @param i
     * @param j
     * @param m
     * @param n
     * @param k
     * @param visited
     * @return
     */
    public static int movingCountCore(int i, int j, int m, int n, int k, boolean[][] visited) {

        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || (getSum(i) + getSum(j) > k)) {
            return 0;
        }

        visited[i][j] = true;

        return movingCountCore(i - 1, j, m, n, k, visited)
                + movingCountCore(i, j + 1, m, n, k, visited)
                + movingCountCore(i + 1, j, m, n, k, visited)
                + movingCountCore(i, j - 1, m, n, k, visited) + 1;
    }

    private static int getSum(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

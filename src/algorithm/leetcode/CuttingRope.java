package algorithm.leetcode;

/**
 * leetcode, 剑指offer 14.15. 剪绳子
 */
public class CuttingRope {

    public static void main(String[] args) {

        System.out.println(cuttingRopeDynamic(10));
        System.out.println(cuttingRopeGreedy(10));
    }

    /**
     * 剪绳子，动态规划
     *
     * @param n
     * @return
     */
    public static int cuttingRopeDynamic(int n) {

        //记录长度为i的绳子，各段长度乘积的最大值
        int[] dp = new int[n + 1];

        //定值
        dp[2] = 1;

        //从长度为3的绳子开始计算
        for (int i = 3; i <= n; i++) {

            //j表示剪去长度为j的绳子，没必要从1开始, 当n=3时，剪去长度为1的绳子=剪去长度为2的绳子=最大值，当n>3时，剪去长度为1的绳子必不是最大值
            for (int j = 2; j < i; j++) {

                //剪去长度为j的绳子后，剩下(i-j)长度的绳子可以剪也可以不剪，如果剪长度乘积为j*(i-j)，如果不剪长度乘积为j*dp[i-j]，取两者最大值
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        //返回长度为n的结果
        return dp[n];
    }

    /**
     * 剪绳子，贪心算法
     * 注释：尽可能多剪长度为3的绳子，则各段乘积最大
     *
     * @param n
     * @return
     */
    public static int cuttingRopeGreedy(int n) {

        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int a = n / 3;
        int b = n % 3;//余数分不同情况处理
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }

        return (int) Math.pow(3, a) * 2;
    }
}

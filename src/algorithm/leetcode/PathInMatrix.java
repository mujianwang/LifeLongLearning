package algorithm.leetcode;

/**
 * leetcode, 剑指offer 12. 矩阵中的路径
 */
public class PathInMatrix {

    public static void main(String[] args) {

        char[][] board = new char[][]{{'A', 'B', 'C'}, {'D', 'E', 'F'}};
        String word = "ABC";
        boolean result = exist(board, word);
        System.out.println(result);

    }

    /**
     * 入口方法
     *
     * @param board
     * @param word
     * @return
     */
    public static boolean exist(char[][] board, String word) {

        char[] wordArray = word.toCharArray();
        int pathLength = 0;

        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (hasPath(board, visited, wordArray, pathLength, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 递归查找路径
     *
     * @param board
     * @param visited
     * @param wordArray
     * @param pathLength
     * @param row
     * @param col
     * @return
     */
    public static boolean hasPath(char[][] board, boolean[][] visited, char[] wordArray, int pathLength, int row, int col) {

        boolean hasPath = false;

        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length
                && board[row][col] == wordArray[pathLength] && !visited[row][col]) {

            if (pathLength == wordArray.length - 1) {
                return true;
            }

            pathLength++;
            visited[row][col] = true;

            hasPath = hasPath(board, visited, wordArray, pathLength, row, col - 1)
                    || hasPath(board, visited, wordArray, pathLength, row - 1, col)
                    || hasPath(board, visited, wordArray, pathLength, row, col + 1)
                    || hasPath(board, visited, wordArray, pathLength, row + 1, col);

            if (!hasPath) {
                pathLength--;
                visited[row][col] = false;
            }

        }

        return hasPath;
    }
}

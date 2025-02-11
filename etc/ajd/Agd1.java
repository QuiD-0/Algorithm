import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().solution(new int[][]{{1, 0}, {0, 1}}, 1)));
    }

    static class Solution {
        public int[][] solution(int[][] square, int k) {
            for (int i = 0; i < k; i++) {
                square = expand(square);
            }
            return square;
        }

        public int[][] expand(int[][] square) {
            int n = square.length;
            int[][] newSquare = new int[2 * n][2 * n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    newSquare[i][j] = square[i][j];
                    newSquare[2 * n - i -1][j] = square[i][j];
                    newSquare[i][2 * n - j - 1] = square[i][j];
                    newSquare[2 * n -i - 1][2 * n - j - 1] = square[i][j];
                }
            }
            return newSquare;
        }
    }
}

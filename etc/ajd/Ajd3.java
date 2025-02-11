import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        int answer = solution.solution(grid);
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int[][] grid) {
            int answer = 0;
            int n = grid.length;
            int m = grid[0].length;
            //0.0 -> n-1,m-1 까지 가는 최솟값
            int[][] dp = new int[n][m];
            dp[0][0] = grid[0][0];
            for (int i = 1; i < n; i++) {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }
            for (int i = 1; i < m; i++) {
                dp[0][i] = dp[0][i - 1] + grid[0][i];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
            answer = dp[n - 1][m - 1];
            return answer;
        }

    }

}

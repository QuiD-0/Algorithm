import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MakeProblem {
    static int n, num;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("\\s");
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(line[j]);
                if (temp % 7 == 0) {
                    map[i][j] = temp + 10;
                } else {
                    map[i][j] = temp;
                }
            }
        }
        int targetCol = Integer.parseInt(br.readLine());
        int throwCount = Integer.parseInt(br.readLine());

        num = n / 2; // 회전할 레이어 수
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            rotatematrix(n, n, map);
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, map[targetCol - 1][j]);
            }
            res.add(max);
        }
        Collections.sort(res, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < throwCount; i++) {
            ans += res.get(i);
        }
        System.out.println(ans);
    }

    static void rotatematrix(int m, int n, int mat[][]) {
        int row = 0, col = 0;
        int prev, curr;

        while (row < m && col < n) {

            if (row + 1 == m || col + 1 == n)
                break;

            prev = mat[row + 1][col];

            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;

            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }

    }
}

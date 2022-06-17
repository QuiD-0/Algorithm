import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1210 {
    static int[][] mat = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t < 11; t++) {
            //input
            bf.readLine();
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < 100; j++) {
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //find endpoint;
            int x = 99;
            int y = 0;
            for (int j = 0; j < 100; j++) {
                if (mat[99][j] == 2) {
                    y = j;
                    break;
                }
            }
            //search
            int[][] dir = {{0, 1}, {0, -1}, {-1, 0}};
            int dx, dy;
            while (x != 0) {
                mat[x][y] = 0;
                for (int i = 0; i < 3; i++) {
                    dx = x + dir[i][0];
                    dy = y + dir[i][1];
                    if (dx >= 0 && dx < 100 && dy >= 0 && dy < 100 && (mat[dx][dy] == 1 || mat[dx][dy] == 2)) {
                        x = dx;
                        y = dy;
                        break;
                    }
                }
            }
            //out
            System.out.printf("#%d %d\n", t, y);
        }
    }
}

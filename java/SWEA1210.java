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
            int startX = 99;
            int startY = 0;
            for (int j = 0; j < 100; j++) {
                if (mat[99][j] == 2) {
                    startY = j;
                }
            }
            //search
            int[][] dir = {{0,1},{0,-1},{-1,0}};
            while (startX != 0) {
                mat[startX][startY]=0;
                for (int i = 0; i < 3; i++) {
                    int dx, dy;
                    dx = startX + dir[i][0];
                    dy = startY + dir[i][1];
                    if (dx >= 0 && dx < 100 && dy >= 0 && dy < 100 && (mat[dx][dy] == 1 || mat[dx][dy] == 2)) {
                        startX = dx;
                        startY = dy;
                        break;
                    }
                }
            }
            //out
            System.out.printf("#%d %d\n",t,startY);
        }
    }
}

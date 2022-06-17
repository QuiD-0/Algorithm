import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class JO1082 {
    static int R, C;
    static String[][] matrix;
    static int[] link;
    static boolean[][] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();
        matrix = new String[R][C];
        visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String[] a = sc.nextLine().split("");
            for (int j = 0; j < C; j++) {
                matrix[i][j] = a[j];
                if (a[j].equals("S")) {
                    link = new int[]{i, j};
                }
            }
        }
//        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));
        Deque q = new LinkedList();
        q.add(new Info(link, 0));
        int time = -1;
        int ans = 0;
        while (!q.isEmpty()) {
//            System.out.println(q);
            Info cur = (Info) q.poll();
            int curTime = cur.time;
            int curX = cur.pos[0];
            int curY = cur.pos[1];

            visit[curX][curY] = true;
            if (curTime > time) {
                fire();
//                System.out.println(Arrays.deepToString(matrix));
                time++;
            }
            if (matrix[curX][curY].equals("D")) {
                ans = time;
                break;
            }
            for (int[] dxdy : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                int nx = curX + dxdy[0];
                int ny = curY + dxdy[1];
                if ((nx >= 0 && nx < R && ny >= 0 && ny < C && !visit[nx][ny]) && (matrix[nx][ny].equals(".") || matrix[nx][ny].equals("D"))) {
                    q.add(new Info(new int[]{nx, ny}, curTime + 1));
                }
            }
        }
        System.out.println(ans != 0 ? ans : "impossible");
    }

    private static void fire() {
        ArrayList<int[]> fire = new ArrayList();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j].equals("*")) {
                    fire.add(new int[]{i, j});
                }
            }
        }
        for (int[] pos : fire) {
            for (int[] dxdy : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                int nx = dxdy[0] + pos[0];
                int ny = dxdy[1] + pos[1];
                if ((nx >= 0 && nx < R && ny >= 0 && ny < C) && (matrix[nx][ny].equals("."))) {
                    matrix[nx][ny] = "*";
                }
            }
        }
    }

    static class Info {
        int[] pos;
        int time;

        public Info(int[] pos, int time) {
            this.pos = pos;
            this.time = time;
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ17135 {
    static int[][] map;
    static int n, m, d;
    static int ans = 0;
    static ArrayList<Integer> arrow = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        nCr(0, 0);
        System.out.println(ans);
    }

    private static void attack() {
        int temp = 0;
        int castle = n;
        int[][] map2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.arraycopy(map[i], 0, map2[i], 0, m);
        }

        while (castle > 0) {
            ArrayList<Integer[]> enemy = new ArrayList<>();
            for (int k = 0; k < arrow.size(); k++) {
                int min = Integer.MAX_VALUE;
                int[] pos = new int[2];
                for (int j = 0; j < m; j++) {
                    for (int i = castle - 1; i >= 0; i--) {
                        int diff = Math.abs(castle - i) + Math.abs(arrow.get(k) - j);

                        if (map2[i][j] == 1 && diff <= d) {
                            if (diff < min) {
                                min = diff;
                                pos[0] = i;
                                pos[1] = j;
                            }
                            break;
                        }
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    enemy.add(new Integer[]{pos[0], pos[1]});
                }
            }
            for (int i = 0; i < enemy.size(); i++) {
                if (map2[enemy.get(i)[0]][enemy.get(i)[1]] != 0) {
                    temp += 1;
                    map2[enemy.get(i)[0]][enemy.get(i)[1]] = 0;
                }
            }
            castle -= 1;

        }

        if (temp > ans) ans = temp;
    }

    private static void nCr(int cnt, int start) {
        if (cnt == 3) {
            attack();
            return;
        }
        for (int i = start; i < m; i++) {
            arrow.add(i);
            nCr(cnt + 1, i + 1);
            arrow.remove(arrow.size() - 1);
        }
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18242 {

    static String[][] map;
    static int n, m;
    static int[] start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());
        map = new String[n][m];
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(bf.readLine());
            map[i] = str.nextToken().split("");
        }
        start = findStart();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j].equals("#")) {
                    end = new int[]{i, j};
                }
            }
        }
        int r = (end[0] - start[0] + 1) / 2;
        if (map[start[0] + r][start[1]].equals("."))
            System.out.println("LEFT");
        else if (map[end[0] - r][end[1]].equals("."))
            System.out.println("RIGHT");
        else if (map[start[0]][start[1] + r].equals("."))
            System.out.println("UP");
        else
            System.out.println("DOWN");
    }

    private static int[] findStart() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j].equals("#")) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1992 {
    static int n;
    static String[][] mat;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        mat = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] nums = bf.readLine().split("");
            for (int j = 0; j < n; j++) {
                mat[i][j] = nums[j];
            }
        }
        zip(0, 0, n);
        System.out.println(sb);
    }

    private static void zip(int x, int y, int size) {
        if (size == 1) {
            sb.append(mat[x][y]);
        } else {
            boolean flag = true;
            String first = mat[x][y];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (!mat[x+i][y+j].equals(first)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag==true) {
                //모두 같을때
                sb.append(mat[x][y]);
            } else {
                //다를때 분할
                sb.append("(");
                zip(x, y, size / 2);
                zip(x, y + (size / 2), size / 2);
                zip(x + (size / 2), y, size / 2);
                zip(x + (size / 2), y + (size / 2), size / 2);
                sb.append(")");
            }
        }
    }
}

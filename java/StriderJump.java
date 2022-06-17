import java.util.Scanner;

public class StriderJump {
    static int N, S, Answer;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            int[][] lake = new int[N][N];

            S = sc.nextInt();
            int[][] strider = new int[S][3];
            Answer = 0;
            for (int k = 0; k < S; k++) {
                strider[k][0] = sc.nextInt();
                strider[k][1] = sc.nextInt();
                strider[k][2] = sc.nextInt();
            }
            for (int j = 0; j < S; j++) {

                int cnt = 3;
                int len = lake.length;
                int row, col;
                row = strider[j][0];
                col = strider[j][1];

                int flag = 0;

                if (lake[row][col] == 1) {
                    System.out.println("#" + test_case + " " + (j + 1));
                    break;
                }

                for (int i = 0; i < 3; i++) {
                    if (strider[j][2] == 1) row += cnt;
                    else col += cnt;

                    if (col >= len || row >= len) {
                        flag = -1;
                        break;
                    } else {
                        if (lake[row][col] == 1) {
                            Answer = j + 1;
                            flag = 1;
                            break;
                        } else {
                            lake[row][col] = 1;
                            cnt--;
                        }
                    }
                }
                if (flag == 1)
                    break;
            }
            System.out.println("#" + test_case + " " + Answer);
        }
    }
}

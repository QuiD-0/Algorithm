import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1873 {
    static int[] curState = {0, 0, 0};
    static String[][] mat;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int a = 1; a <= t; a++) {
            String[] nums = bf.readLine().split(" ");
            int h = Integer.parseInt(nums[0]);
            int w = Integer.parseInt(nums[1]);
            mat = new String[h][w];
            for (int i = 0; i < h; i++) {
                mat[i] = bf.readLine().split("");
            }
            bf.readLine();
            String[] cmds = bf.readLine().split("");
            curState = findCurDir();
            for (String cmd : cmds) {
                switch (cmd) {
                    case ("S"):
                        shoot();
                        break;
                    default:
                        move(cmd);
                        break;
                }
            }
            System.out.printf("#%d ", a);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j]);
                }
                System.out.println();
            }

        }
    }

    private static void move(String cmd) {
        int x = curState[0];
        int y = curState[1];
        switch (cmd) {
            case "U":
                if (x - 1 >= 0) {
                    if (mat[x - 1][y].equals(".")) {
                        mat[curState[0]--][y] = ".";
                    }
                }
                mat[curState[0]][y] = "^";
                curState[2] = 0;
                break;
            case "D":
                if (x + 1 < mat.length) {
                    if (mat[x + 1][y].equals(".")) {
                        mat[curState[0]++][y] = ".";
                    }
                }
                mat[curState[0]][y] = "v";
                curState[2] = 1;
                break;
            case "L":
                if (y - 1 >= 0) {
                    if (mat[x][y - 1].equals(".")) {
                        mat[x][curState[1]--] = ".";
                    }
                }
                mat[x][curState[1]] = "<";
                curState[2] = 2;
                break;
            case "R":
                if (y + 1 < mat[0].length) {
                    if (mat[x][y + 1].equals(".")) {
                        mat[x][curState[1]++] = ".";
                    }
                }
                mat[x][curState[1]] = ">";
                curState[2] = 3;
                break;
        }
    }

    private static void shoot() {
        int x = curState[0];
        int y = curState[1];
        switch (curState[2]) {
            case 0:
                for (; x >= 0; x--) {
                    if (mat[x][y].equals("*")) {
                        mat[x][y] = ".";
                        break;
                    } else if (mat[x][y].equals("#")) {
                        break;
                    }
                }
                break;
            case 1:
                for (; x < mat.length; x++) {
                    if (mat[x][y].equals("*")) {
                        mat[x][y] = ".";
                        break;
                    } else if (mat[x][y].equals("#")) {
                        break;
                    }
                }
                break;
            case 2:
                for (; y >= 0; y--) {
                    if (mat[x][y].equals("*")) {
                        mat[x][y] = ".";
                        break;
                    } else if (mat[x][y].equals("#")) {
                        break;
                    }
                }
                break;
            case 3:
                for (; y < mat[0].length; y++) {
                    if (mat[x][y].equals("*")) {
                        mat[x][y] = ".";
                        break;
                    } else if (mat[x][y].equals("#")) {
                        break;
                    }
                }
                break;
        }
    }

    private static int[] findCurDir() {
        int x = 0, y = 0, d = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j].equals("<")) {
                    x = i;
                    y = j;
                    d = 2;
                } else if (mat[i][j].equals(">")) {
                    x = i;
                    y = j;
                    d = 3;
                } else if (mat[i][j].equals("^")) {
                    x = i;
                    y = j;
                    d = 0;
                } else if (mat[i][j].equals("v")) {
                    x = i;
                    y = j;
                    d = 1;
                }
            }
        }
        int[] res = {x, y, d};
        return res;
    }
}
/*
입력

1
4 10
**********
#>-_______
******#***
#######***
23
SSSSSSSSSSSSUUUDDDRRRLLL


*/
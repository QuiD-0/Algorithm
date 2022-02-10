import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        int[][] board = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    board[x + j][y + k] = 1;
                }
            }
        }
        int sum=0;
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                sum+=board[j][k];
            }
        }
        System.out.println(sum);

    }
}

import java.util.Scanner;

public class SWEA5215 {

    static int[] score = new int[21];
    static int[] kcal = new int[21];
    static int answer = 0;
    static int n, maxKcal;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int idx = 1; idx <= tc; ++idx) {
            answer = 0;
            n = sc.nextInt();
            maxKcal = sc.nextInt();

            for (int i = 0; i < n; ++i) {
                score[i] = sc.nextInt();
                kcal[i] = sc.nextInt();
            }

            recursive(0, 0, 0);
            System.out.println("#" + idx + " " + answer);
        }
    }

    static void recursive(int idx, int sumScore, int sumKcal) {
        if (idx == n) {
            if (answer < sumScore && sumKcal <= maxKcal) {
                answer = sumScore;
            }

            return;
        }

        recursive(idx + 1, sumScore + score[idx], sumKcal + kcal[idx]);
        recursive(idx + 1, sumScore, sumKcal);
    }
}

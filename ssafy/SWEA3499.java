import java.util.Scanner;

public class SWEA3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String[] cards = sc.nextLine().split(" ");
            int a = n - n / 2;
            System.out.printf("#%d ", i);
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%s ", cards[j / 2]);
                } else {
                    System.out.printf("%s ", cards[j / 2 + a]);
                }
            }
            System.out.println();
        }
    }
}
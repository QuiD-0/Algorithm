import java.util.*;

public class SWEA1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int n = sc.nextInt();
            LinkedList<Integer> l = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                l.add(tmp);
            }

            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                sc.next();
                int idx = sc.nextInt();
                int m = sc.nextInt();
                int[] a = new int[m];
                for (int j = 0; j < m; j++) {
                    a[j] = sc.nextInt();
                }

                for (int j = m - 1; j >= 0; j--) {
                    l.add(idx, a[j]);
                }
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
}

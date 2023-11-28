import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList ans = new ArrayList();
        Queue q = new LinkedList();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            ans.add(q.poll());
        }
        System.out.print("<");
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%d, ", ans.get(i));
        }
        System.out.printf("%d>", ans.get(n - 1));
    }

}

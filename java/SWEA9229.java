import java.util.Arrays;
import java.util.Scanner;

public class SWEA9229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TC = scanner.nextInt();
        for (int tc = 1; tc <= TC; tc++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[] snacks = new int[N];
            for (int n = 0; n < N; n++)
                snacks[n] = scanner.nextInt();

            int max = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (snacks[i] + snacks[j] <= M)
                        max = Math.max(max, snacks[i] + snacks[j]);
                }
            }

            System.out.print("#" + tc + " ");
            if (max == 0)
                System.out.println(-1);
            else
                System.out.println(max);
        }
        //combi(0,0);
    }
    static int[] arr = {1,2,3,4,5};
    static int[] sel = new int[2];

    private static void combi(int cnt, int s) {
        if(cnt==2){
            System.out.println(Arrays.toString(sel));
            return;
        }
        for(int i=s;i<5;i++){
            sel[cnt]=arr[i];
            combi(cnt+1,i+1);
        }
    }


}

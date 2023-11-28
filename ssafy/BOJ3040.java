import java.util.Scanner;

public class BOJ3040 {
    static int[] nan = new int[9];
    static int[] sel = new int[7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            nan[i] = sc.nextInt();
        }
        combi(0, 0);
    }

    private static void combi(int cnt, int start) {
        if (cnt == 7) {
            int sum=0;
            for(int i=0;i<7;i++){
                sum+=sel[i];
            }
            if(sum==100){
                for(int a:sel){
                    System.out.println(a);
                }
            }
            return;
        }
        for(int i=start;i<9;i++){
            sel[cnt]=nan[i];
            combi(cnt+1,i+1);
        }
    }
}

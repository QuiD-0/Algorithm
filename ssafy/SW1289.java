import java.util.Scanner;

public class SW1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String[] a = sc.next().split("");
            String init="0";
            int count=0;
            for(String alpha:a){
                if(!alpha.equals(init)){
                    count++;
                    init=alpha;
                }
            }
            System.out.printf("#%d %d\n",test_case,count);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class SWEA4012 {
    static int n;
    static int min;
    static int[] num;
    static int[][] mat;
    static int[] input;
    static boolean[] sel;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            min = Integer.MAX_VALUE;
            n = sc.nextInt();
            num=new int[n/2];
            mat = new int[n][n];
            sel = new boolean[n];
            input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = i;
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            combi(0,0);
            System.out.println("#"+tc+" "+min);
        }
    }

    private static void combi(int cnt,int start) {
        if (cnt == n/2) {
            int res = solve();
            min = Math.min(res, min);
            return;
        }
        for (int i = start; i < n; i++) {
            sel[i] = true;
            num[cnt] = input[i];
            combi(cnt + 1,i+1);
            sel[i] = false;
        }
    }

    private static int solve() {

        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();

        // 음식 별 식재료 나누기
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int a:num){
                if(a==i) flag=true;
            }
            if(flag) aList.add(i);
            else bList.add(i);
        }

        int a=0;	// A 음식의 시너지의 합
        int b=0;	// B 음식의 시너지의 합

        // 각 음식의 시너지 합 구하기
        for(int i=0; i<aList.size()-1; i++){
            for(int j=i; j<aList.size(); j++){
                a += mat[aList.get(i)][aList.get(j)];
                a += mat[aList.get(j)][aList.get(i)];
                b += mat[bList.get(i)][bList.get(j)];
                b += mat[bList.get(j)][bList.get(i)];
            }
        }

        return Math.abs(a-b);
    }
}

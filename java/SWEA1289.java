import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SWEA1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int T =sc.read();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String[] a = sc.readLine().split("");
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

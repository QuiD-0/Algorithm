import java.util.Arrays;
import java.util.Scanner;

public class SWEA3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String[] cards = sc.nextLine().split(" ");
            int a,b;
            b=n/2;
            a=n-b;
            String[] order = new String[n];
            for(int j=0;j<n;j++){
                if(j%2==0){
                    order[j]=cards[j/2];
                }else{
                    order[j]=cards[j/2+a];
                }
            }
            System.out.printf("#%d ",i);
            for(String s:order){
                System.out.printf("%s ",s);
            }
            System.out.println();
        }

    }
}

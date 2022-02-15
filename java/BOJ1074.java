import java.util.Scanner;

public class BOJ1074 {
    static int n, r, c, count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        find(0, 0, (int)Math.pow(2,n));
    }

    private static void find(int x, int y, int n) {
        if (n == 1) {
            if(x==r&&y==c){
                System.out.println(count);
                return;
            }else{
                count++;
            }
        } else {
            find(x, y, n / 2);
            find(x, y + (n / 2), n / 2);
            find(x + (n / 2), y, n / 2);
            find(x + (n / 2), y + (n / 2), n / 2);
        }
    }
}

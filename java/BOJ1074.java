import java.util.Scanner;

public class BOJ1074 {
    static int n, r, c, count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        System.out.println(solve(0, 0, (int)Math.pow(2,n)));
    }
    public static int solve(int nr, int nc, int size) {

        if (size == 1) {
            return 0;
        }

        if (r < nr + size / 2 && c < nc + size / 2)
            return solve(nr, nc, size / 2);

        else if (r < nr + size / 2 && c < nc + size)
            return solve(nr, nc + size / 2, size / 2) + (int) Math.pow(size / 2, 2);

        else if (r < nr + size && c < nc + size / 2)
            return solve(nr + size / 2, nc, size / 2) + (int) Math.pow(size / 2, 2) * 2;

        else
            return solve(nr + size / 2, nc + size / 2, size / 2) + (int) Math.pow(size / 2, 2) * 3;

    }
}

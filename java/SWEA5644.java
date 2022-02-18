import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SWEA5644 {
    static String[] aPath, bPath;
    static int m, a;
    static AP[] aps;

    static class AP implements Comparable<AP> {
        int x, y, dix, power;

        @Override
        public String toString() {
            return "AP{" +
                    "x=" + x +
                    ", y=" + y +
                    ", dix=" + dix +
                    ", power=" + power +
                    '}';
        }

        public AP(int x, int y, int dix, int power) {
            this.x = x;
            this.y = y;
            this.dix = dix;
            this.power = power;
        }

        @Override
        public int compareTo(AP o) {
            return o.power - this.power;
        }
    }

    public static void main(String[] args) throws IOException {
        int tc;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        tc = Integer.parseInt(bf.readLine());
        for (int t = 0; t < tc; t++) {
            String[] str = bf.readLine().split(" ");
            m = Integer.parseInt(str[0]);
            a = Integer.parseInt(str[1]);
            aps = new AP[a];
            aPath = bf.readLine().split(" ");
            bPath = bf.readLine().split(" ");
            for (int i = 0; i < a; i++) {
                str = bf.readLine().split(" ");
                AP ap = new AP(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
                aps[i] = ap;
            }
            Arrays.sort(aps);
            int res = move();
            System.out.println("#"+t+" "+res);
        }

    }

    private static int move() {
        int[][] direction = {{0, 0}, {0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        int ax = 1, ay = 1, bx = 10, by = 10;
        int ans = 0;
        for (int i = 0; i <= m; i++) {
            int maxP = 0;
            ArrayList<AP> nearA = new ArrayList();
            ArrayList<AP> nearB = new ArrayList();
            for (int j = 0; j < a; j++) {
                AP tempAP = aps[j];
                int aDis = Math.abs(ax - tempAP.x) + Math.abs(ay - tempAP.y);
                int bDis = Math.abs(bx - tempAP.x) + Math.abs(by - tempAP.y);
                if (aDis <= tempAP.dix) nearA.add(tempAP);
                if (bDis <= tempAP.dix) nearB.add(tempAP);
            }

            if (!nearA.isEmpty() && !nearB.isEmpty()) {
                if (nearA.get(0) == nearB.get(0)) {
                    if (nearA.size() >= 2){
                        maxP = Math.max(nearA.get(1).power + nearB.get(0).power, maxP);
                    }
                    if (nearB.size() >= 2){
                        maxP = Math.max(nearA.get(0).power + nearB.get(1).power, maxP);
                    }
                } else maxP = Math.max(nearA.get(0).power + nearB.get(0).power, maxP);
            }
            if (!nearA.isEmpty()) maxP = Math.max(nearA.get(0).power, maxP);
            if (!nearB.isEmpty()) maxP = Math.max(nearB.get(0).power, maxP);
            ans += maxP;

            if (i == m) continue;
            ax += direction[Integer.parseInt(aPath[i])][0];
            ay += direction[Integer.parseInt(aPath[i])][1];
            bx += direction[Integer.parseInt(bPath[i])][0];
            by += direction[Integer.parseInt(bPath[i])][1];
        }

        return ans;
    }
}

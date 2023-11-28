import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5656 {

    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int TC, N, W, H;
    static int[][] map, temp;
    static int answer;
    static int[] sel;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        TC = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= TC; tc++) {

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // 구슬 떨어뜨리는 횟수
            W = Integer.parseInt(st.nextToken()); // 맵의 가로 [ 열 ]
            H = Integer.parseInt(st.nextToken()); // 맵의 높이 [ 행 ]

            map = new int[H][W];
            sel = new int[N];
            temp = new int[H][W];
            answer = Integer.MAX_VALUE;
            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    temp[i][j] = map[i][j];
                }
            }

            // 1. dfs ( 가로 길이 최대 12개 ) 중복순열 구하기 - 최대 N번 ( idx == N 일때 기저조건 )
            dfs(0);

            // 2. 4개 다 선택 되었다면, 순차적으로 터뜨리기 - 이것도 재귀로
            System.out.println("#" + tc + " " + answer);

        } // end tc

    } // end main

    private static void dfs(int idx) {
        if (idx == N) {

            for (int i = 0; i < N; i++) {
                int x = GetY(sel[i]); // 터뜨릴 행
                int y = sel[i]; // 터뜨릴 열
                int power = map[x][y];
                Bomb(x, y, power);
                pull(); // 빈 공간 땡기기
            }
//			print();
            answer = Math.min(answer, getBlock());
            copy();
            return;
        }

        // 열의 개수 모두 탐색
        for (int i = 0; i < W; i++) {
            sel[idx] = i; // i 열 터뜨리기
            dfs(idx + 1);
        }

    }

    /**
     * 빈 공간 채워주는 함수
     **/
    private static void pull() {

        for (int i = 0; i < W; i++) { // 열

            for (int j = H - 1; j > 0; j--) { // 행
                if (map[j][i] == 0) {

                    int target = j - 1;
                    int idx = j - 1;
                    // 위에 블럭 있는 위치 찾기
                    while (target >= 0) {
                        if (map[target][i] > 0) {
                            idx = target;
                            break;
                        }
                        target--;
                    }
                    map[j][i] = map[idx][i];
                    map[idx][i] = 0;
                }
            }

        }
    }

    /**
     * 테스트 함수
     **/
    private static void print() {

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===");
    }

    /**
     * map이 매번 바뀌니 저장해 놓은 temp로 부터 복사 해주는 함수
     **/
    private static void copy() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map[i][j] = temp[i][j];
            }
        }
    }

    /**
     * 벽돌의 개수 세는 함수
     **/
    private static int getBlock() {
        int result = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] > 0)
                    result++;
            }
        }

        return result;
    }

    // x : 행 , y : 열

    /**
     * 공 터뜨리는 함수 dfs로 구현
     **/
    private static void Bomb(int x, int y, int power) {

        for (int d = 0; d < 4; d++) {

            int nx = x; // 행
            int ny = y; // 열

            int tmp = 0;
            while (tmp < power) {

                if (!(nx >= 0 && nx < H && ny >= 0 && ny < W)) {
                    tmp++;
                    continue;
                }

                if (map[nx][ny] > 1) {
                    int t = map[nx][ny];
                    map[nx][ny] = 0;
                    Bomb(nx, ny, t); // 크기가 1보다 크면 연쇄 폭탄 터뜨리기
                }

                map[nx][ny] = 0;

                nx += dr[d];
                ny += dc[d];

                tmp++;
            }
        }
    }

    /**
     * 공 떨어뜨릴 때 맨위에 있는 위치 찾기
     **/
    private static int GetY(int c) {

        for (int r = 0; r < H; r++) {
            if (map[r][c] > 0)
                return r;
        }
        return 0;
    }

}


/*

1
3 10 10
0 0 0 0 0 0 0 0 0 0
1 0 1 0 1 0 0 0 0 0
1 0 3 0 1 1 0 0 0 1
1 1 1 0 1 2 0 0 0 9
1 1 4 0 1 1 0 0 1 1
1 1 4 1 1 1 2 1 1 1
1 1 5 1 1 1 1 2 1 1
1 1 6 1 1 1 1 1 2 1
1 1 1 1 1 1 1 1 1 5
1 1 7 1 1 1 1 1 1 1

 */
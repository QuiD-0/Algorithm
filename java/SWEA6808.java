import java.io.*;
import java.util.StringTokenizer;

public class SWEA6808 {
    static int C = 9;
    static int[] gyu = new int[C]; //규영이 갖는 카드 번호 리스트
    static int[] in = new int[C] ; //인영이 갖는 카드 번호 리스트

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] allCards = new boolean[C*2+1];

            for(int i=0;i<C;i++) {
                gyu[i] = Integer.parseInt(st.nextToken());
                allCards[gyu[i]]=true;
            }

            int idx=0;
            for(int i=1;i<allCards.length;i++) {
                if(!allCards[i]) in[idx++]=i;
            }

            inCards = new int[C]; // 인영이가 낼 수 있는 카드 조합
            result = new int[2]; // 결과 출력
            perm(0,0);
            System.out.println("#"+tc+" "+result[1]+" "+result[0]);
        }
    }

    static int[] inCards;
    // 순열
    private static void perm(int cnt, int flag) {
        if(cnt==inCards.length) {
            cal();
            return;
        }

        for(int i=0;i<inCards.length;i++) {
            if((flag&1<<i)!=0)continue;
            inCards[cnt]=in[i];
            perm(cnt+1,(flag|1<<i));
        }
    }

    static int[] result;
    private static void cal() {
        int inSum=0; //인영이 점수
        int gyuSum=0; // 규영이 점수

        for(int i=0;i<inCards.length;i++) {
            if(inCards[i]<gyu[i]) {
                gyuSum+=inCards[i]+gyu[i];
            }
            // 같은 수가 없으므로 else를 사용해도 가능
            else {
                inSum+=inCards[i]+gyu[i];
            }
        }

        if(gyuSum>inSum) result[1]++; // 이겼을 경우=> index 1
        else if(gyuSum<inSum) result[0]++; //진경우=>index 0
    }
}

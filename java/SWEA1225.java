
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA1225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<11;t++){
            sc.nextInt();
            Queue q = new LinkedList();
            for(int i =0;i<8;i++){
                q.add(sc.nextInt());
            }
            int cnt=1;
            while(true){
                int temp= (int) q.poll();
                temp-=cnt;
                if(temp<=0){
                    q.add(0);
                    break;
                }else{
                    q.add(temp);
                }
                cnt++;
                if(cnt>5){
                    cnt=1;
                }
            }
            System.out.printf("#%d %d %d %d %d %d %d %d %d\n",t,q.poll(),q.poll(),q.poll(),q.poll(),q.poll(),q.poll(),q.poll(),q.poll());
        }
    }
}

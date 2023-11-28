import java.util.*;

public class SWEA1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=1;t<11;t++){
            int count=sc.nextInt();
            int[] arr = new int[100];
            for(int i=0;i<100;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            while(count--!=0){
                if(arr[99]-arr[0]==1)break;
                arr[99]=arr[99]-1;
                arr[0]=arr[0]+1;
                Arrays.sort(arr);
            }
            System.out.printf("#%d %d\n",t,arr[99]-arr[0]);
        }
    }
}

import java.util.*;

public class SWEA1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=1;t<11;t++){
            int count=sc.nextInt();
            ArrayList arr = new ArrayList();
            for(int i=0;i<100;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            while(count--!=0){
                arr.set(99, ((int)arr.get(99) - 1));
                arr.set(0, ((int)arr.get(0) + 1));
                Collections.sort(arr);
            }
            System.out.printf("#%d %d\n",t,(int)arr.get(99)-(int)arr.get(0));
        }
    }
}

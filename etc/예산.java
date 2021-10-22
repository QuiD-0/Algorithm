import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int ans=0;
        for(int a:d){
            if (a<=budget){
                budget-=a;
                ans++;
            }else{
                break;
            }
            
        }
        return ans;
    }
}
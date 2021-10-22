import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=1+i;j<numbers.length;j++){
                if(!answer.contains(numbers[i]+numbers[j])){
                    answer.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] arr = new int[answer.size()];
        for(int a=0;a<answer.size();a++){
            arr[a]=answer.get(a);
        }
        Arrays.sort(arr);
        return arr;
    }
}
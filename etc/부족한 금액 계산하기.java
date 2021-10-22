class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long res=0;
        for(int i=1;i<count+1;i++){
            res=res+i*price;
        }
        System.out.println(res);
        if(res-money>=0){
            answer = res-money;
        }
        return answer;
    }
}
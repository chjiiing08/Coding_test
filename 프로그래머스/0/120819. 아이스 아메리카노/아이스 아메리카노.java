class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cnt=1;
        while(true){
            if(money<5500) break;
            else{
                money-=5500;
                cnt++;
            }
        }
        answer[1]=money;
        answer[0]=cnt-1;
        return answer;
    }
}
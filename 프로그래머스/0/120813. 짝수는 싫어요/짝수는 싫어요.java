class Solution {
    public int[] solution(int n) {
        int a=0;
        for(int i=n; i>0; i--){
            if(i%2!=0) a++;
        }
        int[] answer = new int[a];
        int index=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                answer[index]=i;
                index++;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] numbers) {
        int cnt=0;
        for(int i=0; i<numbers.length; i++)
            cnt++;
        int[] answer = new int [cnt];
        for(int i=0; i<numbers.length; i++)
            answer[i]=numbers[i]*2;
        return answer;
    }
}
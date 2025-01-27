class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int cnt=1;
        for(int i=0; i<arr.length; i++){
            cnt++;
            answer+=arr[i];
        }
        return answer/(cnt-1);
    }
}
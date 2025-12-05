function solution(a, b) {
    var answer = Number(a.toString()+b.toString());
    var n = Number(b.toString()+a.toString());
    if(answer<n) return n; 
    else return answer;
}
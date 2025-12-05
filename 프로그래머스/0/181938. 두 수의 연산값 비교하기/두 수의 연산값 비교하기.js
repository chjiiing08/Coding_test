function solution(a, b) {
    var answer = Number(a.toString()+b.toString());
    if(answer<2*a*b) answer=2*a*b;
    return answer;
}
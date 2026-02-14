function solution(s) {
    var answer = '';
    var mid = Math.floor(s.length / 2);
    if(s.length%2==0) {
        answer+=s[mid-1];
        answer+=s[mid];
    }
    else answer+=s[mid];
    return answer;
}
function solution(num_list) {
    var answer = 0;
    var n=0;
    for(let i=0; i<num_list.length; i++) (i+1)%2==0 ? answer+=num_list[i]:n+=num_list[i];
    if(answer<n) answer=n;
    return answer;
}
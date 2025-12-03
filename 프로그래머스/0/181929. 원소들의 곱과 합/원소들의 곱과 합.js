function solution(num_list) {
    var answer = 0;
    var num = num_list.reduce((a,b) => a*b,1);
    var num2 = num_list.reduce((a,b) => a+b,0);
    answer = Math.pow(num2,2);
    num<answer ? answer=1:answer=0;
    return answer;
}
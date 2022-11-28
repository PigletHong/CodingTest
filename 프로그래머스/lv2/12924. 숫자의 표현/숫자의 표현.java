class Solution {
    public int solution(int n) {
        int cnt = 0;
        int num = 1;
        int reset = 1;
        int sum = 0;
        while(num <= n){
            if(sum == n){
                cnt++;
                sum = 0;
                num = ++reset;
            } else if(sum > n){
                num = ++reset;
                sum = 0;
            }
            sum += num++;
        }
        int answer = cnt + 1;
        return answer;
    }
}
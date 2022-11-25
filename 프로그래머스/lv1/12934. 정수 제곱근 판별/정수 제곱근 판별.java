class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 0;
        
        for (i=0; i<=n; i++) {
            if(n == (i*i)) {
                answer = (i+1)*(i+1) ;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
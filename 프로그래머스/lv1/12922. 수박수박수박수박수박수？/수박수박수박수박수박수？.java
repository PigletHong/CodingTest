class Solution {
    public String solution(int n) {
        String answer = "";
        String melon = "";
        int i = 0;
        for(i=1; i <= n; i++) {
            if(i%2 != 0) {
                melon += "수";
            } else {
                melon += "박";
            }
        }
        answer = melon;
        return answer;
    }
}
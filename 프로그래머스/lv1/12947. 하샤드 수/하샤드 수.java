class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int result = 0;
        
        String s = Integer.toString(x); //int n을 String으로 변환
        for(int i=0; i<s.length(); i++){
            result += Integer.parseInt(s.substring(i, i+1));
        }
        
        if(x % result == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
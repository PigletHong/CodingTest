class Solution {
    public int solution(int num1, int num2) {
        double sum = (double)num1 / (double)num2;
        int answer = (int)(sum*1000L);
        return answer;
    }
}
class Solution {
    public int[] solution(int money) {
        int sum = money / 5500;
        int num = money - (sum * 5500);
        
        int[] answer = {sum, num};
        return answer;
    }
}
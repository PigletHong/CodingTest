class Solution {
    public int solution(int n) {
        int answer = 0;
        String third = (Integer.toString(n,3));
        String reverse = "";
        for (int i = third.length() - 1; i >= 0; i--) {
            reverse = reverse + third.charAt(i);
        }

        int ten = (Integer.parseInt(reverse, 3));
        answer = ten;
        return answer;
    }
}
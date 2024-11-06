class Solution {
    public int solution(String number) {
        char[] numberArray = number.toCharArray();
        int sum = 0;
        for (char num : numberArray) {
            sum += Integer.parseInt(String.valueOf(num));
        }
        return sum % 9;
    }
}
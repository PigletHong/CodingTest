class Solution {
    public int[] solution(long n) {
        String str = "" + n; // 문자열 + 숫자 = 문자열 (long -> String)
        int[] answer = new int[str.length()]; // // 각 자리 숫자를 원소로 가지는 배열을 만듦
        int cnt = 0;    // 배열의 길이 카운트

        while (n != 0) {
            answer[cnt] = (int) (n % 10); // 12345 % 10 = 5
            n /= 10;    // 12345 / 10 = 1234, 0이 될 때까지 반복함
            cnt++;
        }
        return answer;
    }
}
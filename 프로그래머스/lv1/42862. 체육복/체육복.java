import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        int cnt2 = 0;
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    cnt++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    cnt2++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        answer = n - lost.length + cnt + cnt2;
        return answer;
    }
}
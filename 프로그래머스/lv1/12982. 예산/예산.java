import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int max = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            max += d[i];
            if (max > budget) {
                answer = i;
                break;
            } else if(max==budget) {
                    answer = i + 1;
                    break;
                } else if(max < budget) {
                answer = i + 1;
            }
            }
        return answer;
}
}
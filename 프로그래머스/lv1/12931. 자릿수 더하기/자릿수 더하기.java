import java.util.*;

class Solution {
    public int solution(long n) {        
        List<Integer> list = new ArrayList<>();

        while(n != 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
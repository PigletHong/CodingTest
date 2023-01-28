import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int result = 0;
        for(int i = 0; i < num.length(); i++) {
            result += Integer.parseInt(num.substring(i, i+1));
        }

        return result;
    }
}
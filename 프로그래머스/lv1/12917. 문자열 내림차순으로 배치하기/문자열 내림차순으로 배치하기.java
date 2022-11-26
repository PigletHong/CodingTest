import java.util.*;

class Solution {
    public String solution(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder(new String(arr,0,arr.length));
        return result.reverse().toString();
    }
}
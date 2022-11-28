import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] n = s.split(" ");
        Integer[] num = Stream.of(n).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(num);

        int min = num[0];
        int max = num[num.length-1];

        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}
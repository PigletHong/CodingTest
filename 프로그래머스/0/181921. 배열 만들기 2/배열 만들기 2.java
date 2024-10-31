import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean contain = false;
            boolean contain2 = false;
            String temp = String.valueOf(i);
            char[] tempCharArray = temp.toCharArray();
            for (char c : tempCharArray) {
                if (c == '0' || c == '5') {
                    contain = true;
                } else {
                    contain2 = true;
                }
            }
            if (contain && !contain2) {
                list.add(Integer.parseInt(new String(tempCharArray)));
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
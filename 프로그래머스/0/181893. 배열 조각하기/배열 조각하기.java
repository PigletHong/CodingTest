import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int[] query) {
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        for (int count = 0; count < query.length; count++) {
            int index = query[count];
            if (count % 2 == 0) {
                if (index + 1 < list.size()) {
                    list.subList(index + 1, list.size()).clear();
                }
            } else {
                if (index > 0) {
                    list.subList(0, index).clear();
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
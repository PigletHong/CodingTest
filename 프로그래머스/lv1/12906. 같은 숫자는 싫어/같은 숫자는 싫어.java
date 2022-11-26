import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList();
        int none = -1;

        for (int i = 0; i < arr.length; i++) {
            if (none != arr[i]) {
                none = arr[i];
                list.add(arr[i]);
            }
        }
//         int[] answer = new int[list.size()];
//         for (int j = 0; j < list.size(); j++) {
//             answer[j] = list.get(j);

//         }
        return list;
    }
}

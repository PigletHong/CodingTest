import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
        for (int i = 0; i < name.length; i++) {
            tempMap.put(name[i], yearning[i]);
        }
        int[] pointArray = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int tempPoint = 0;
            for (String human : photo[i]) {
                Integer temp = tempMap.get(human);
                if (temp != null) {
                    tempPoint += tempMap.get(human);
                }
            }
            pointArray[i] = tempPoint;
        }
        return pointArray;
    }
}
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> solutionString = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            solutionString.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(solutionString);

        for (int i = 0; i < solutionString.size(); i++) {
            answer[i] = solutionString.get(i).substring(1);
        }
        return answer;
    }
}
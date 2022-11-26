import java.util.ArrayList;

class Solution {
    public String solution(String s, int n) {
        ArrayList<Character> num = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            num.add(s.charAt(i)); // 문자열 s의 각 알파뱃을 char타입으로 변환
        }

        int[] number = new int[num.size()];

        for (int i = 0; i < num.size(); i++) {

                if (num.get(i) + n >= 91 && num.get(i) < 91) {
                    number[i] = 64 + ((num.get(i) + n) - 90);
                } else if (num.get(i) + n >= 123 && num.get(i) > 96 ) {
                    number[i] = 96 + ((num.get(i) + n) - 122);
                } else if (num.get(i)==32) {
                    number[i] = 32;
                } else {
                    number[i] = num.get(i) + n;
                }
        }
        ArrayList<Character> fin = new ArrayList<Character>();

        for (int i = 0; i < number.length; i++) {
            fin.add((char)(number[i]));
        }
        String answer = "";
        for (int i = 0; i < fin.size(); i++) {
            answer += fin.get(i);
        }
        return answer;
    }
}
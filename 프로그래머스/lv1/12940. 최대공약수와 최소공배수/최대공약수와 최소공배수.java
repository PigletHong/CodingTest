import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long[] solution(int n, int m) {
        long[] answer = new long[2];
        ArrayList<Integer> yaksuN = yaksu(n);
        ArrayList<Integer> yaksuM = yaksu(m);
        ArrayList<Integer> gongyaksu = new ArrayList<>();

        for (int i = 0; i < yaksuN.size(); i++) {
            for (int j = 0; j < yaksuM.size(); j++) {
                if (yaksuN.get(i).equals(yaksuM.get(j))) {
                    gongyaksu.add(yaksuN.get(i));
                }
            }
        }
        int maxgogyaksu = gongyaksu.get(gongyaksu.size()-1);
        int mingongbaesu = n*m/maxgogyaksu;
        
        answer[0] = maxgogyaksu;
        answer[1] = mingongbaesu;
        return answer;
    }    
    
        public static ArrayList<Integer> yaksu(int n) {
        int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
        ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){ // 약수 중 작은 수 저장
                arr.add(i);
                if(n / i != i){ // 약수 중 큰 수 저장
                    arr.add(n / i);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
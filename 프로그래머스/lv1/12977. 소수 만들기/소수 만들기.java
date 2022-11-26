import java.util.ArrayList;

class Solution {
    public boolean isPrime(int n) { // n이 소수라면 true 소수가 아니라면 false를 리턴
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> sosu = new ArrayList<Integer>();
        int cnt = 0;
        
        // 3중 for문으로 3개 수를 더함 //if문으로 index 범위를 벗어나지 않게 설정
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 >= nums.length) break;
            for (int j = i + 1; j < nums.length; j++) {
                for (int x = j +1; x < nums.length; x++) {
                    arr.add(nums[i] + nums[j] + nums[x]);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i))) cnt++;
        }
        return cnt;
    }
}
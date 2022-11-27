class Solution {
    public int solution(int left, int right) {
        int distance = right - left + 1;
        int[] result = new int[distance];
        int sum = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = left+i;
        }

        for (int i = 0; i < result.length; i++) {
            if (yaksu(result[i])) {
                sum += result[i];
            } else {
                sum -= result[i];
            }
        }
        return sum;
    }
    
        public static boolean yaksu(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
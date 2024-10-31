class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        int count = 1;
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(count % 2 != 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
            count ++;
        }
        if (odd >= even) {
            return odd;
        } else {
            return even;
        }
    }
}
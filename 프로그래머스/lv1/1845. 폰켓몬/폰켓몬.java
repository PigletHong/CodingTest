import java.util.HashSet;

public class Solution {
  public int solution(int[] nums) {
    int max = nums.length / 2;

    // 중복제거하기
    HashSet<Integer> numsSet = new HashSet<>();

    for (int num : nums) {
      numsSet.add(num);
    }

    if (numsSet.size() > max) {
      return max;
    } else {
      return numsSet.size();
    }
  }
}
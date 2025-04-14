import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        return Math.min(set.size(), length);
    }
}
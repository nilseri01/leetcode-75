// https://leetcode.com/problems/house-robber
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int num : nums) {
            int maxValue = Math.max(prev2, prev1 + num);
            prev1 = prev2;
            prev2 = maxValue;
        }
        return prev2;
    }
}

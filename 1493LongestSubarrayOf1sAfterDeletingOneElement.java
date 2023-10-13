// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element
class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int zeroCount = 0;
        for (int startIndex = 0, i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                zeroCount-=((nums[startIndex] == 0) ? 1 : 0);
                startIndex++;
            }
            maxLength = Math.max(maxLength, i - startIndex);
        }

        return maxLength;
    }
}

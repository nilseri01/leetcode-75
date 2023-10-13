// https://leetcode.com/problems/max-consecutive-ones-iii
class Solution {
    public int longestOnes(int[] nums, int k) {
        int startIndex = 0, flipCounter = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                flipCounter++;
            }
            while (flipCounter > k) {
                if (nums[startIndex] == 0) {
                    flipCounter--;
                }
                startIndex++;
            }
            maxCount = Math.max(maxCount, i - startIndex + 1);
        }
        return maxCount;
    }
}

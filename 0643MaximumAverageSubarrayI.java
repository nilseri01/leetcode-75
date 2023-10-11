// https://leetcode.com/problems/maximum-average-subarray-i
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int rangeSum = 0;
        for (int i = 0; i < k; i++) {
            rangeSum += nums[i];
        }

        int maxSum = rangeSum;
        for (int i = k; i < nums.length; i++) {
            rangeSum += (nums[i] - nums[i - k]);
            maxSum = Math.max(maxSum, rangeSum);
        }
        return ((double) maxSum) / k;
    }
}

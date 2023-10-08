// https://leetcode.com/problems/container-with-most-water
class Solution {
    public int maxArea(int[] height) {
        int maxValue = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int value = Math.min(height[i], height[j]) * (j - i);
            maxValue = Math.max(maxValue, value);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return maxValue;
    }
}

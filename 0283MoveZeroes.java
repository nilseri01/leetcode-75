// https://leetcode.com/problems/move-zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPointerIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[zeroPointerIndex];
                nums[zeroPointerIndex] = tmp;
                zeroPointerIndex++;
            }
        }
    }
}

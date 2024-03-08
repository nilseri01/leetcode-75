// https://leetcode.com/problems/single-number
class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (final int num : nums) {
            answer ^= num;
        }
        return answer;
    }
}

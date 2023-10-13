// https://leetcode.com/problems/find-the-highest-altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0, currentAlt = 0;
        for (int gainValue : gain) {
            currentAlt += gainValue;
            highestAlt = Math.max(highestAlt, currentAlt);
        }
        return highestAlt;
    }
}

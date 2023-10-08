// https://leetcode.com/problems/is-subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int subIndex = 0;
        for (int i = 0; i < t.length() && subIndex < s.length(); i++) {
            if (s.charAt(subIndex) == t.charAt(i)) {
                subIndex++;
            }
        }
        return subIndex == s.length();
    }
}

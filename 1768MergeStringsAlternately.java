// https://leetcode.com/problems/merge-strings-alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int word1Length = word1.length(), word2Length = word2.length();
        for (int i = 0; i < word1Length || i < word2Length; i++) {
          if (i < word1Length) {
            sb.append(word1.charAt(i));
          }
          if (i < word2Length) {
            sb.append(word2.charAt(i));
          }
        }
        return sb.toString();
    }
}

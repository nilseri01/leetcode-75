// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int currentCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowelList.contains(s.charAt(i))) {
                currentCount++;
            }
        }

        int maxCount = currentCount;
        for (int i = k; i < s.length(); ++i) {
            if (vowelList.contains(s.charAt(i))) {
                currentCount++;
            }
            if (vowelList.contains(s.charAt(i - k))) {
                currentCount--;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}

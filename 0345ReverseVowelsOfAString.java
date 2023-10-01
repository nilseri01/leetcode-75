// https://leetcode.com/problems/reverse-vowels-of-a-string
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowelSet = new HashSet<Character>();
        Collections.addAll(vowelSet, 'a','e','i','o','u','A','E','I','O','U');

        char[] sCharArray = s.toCharArray();
        int i = 0, j = sCharArray.length - 1;
        while (i < j) {
            while (i < j && !vowelSet.contains(sCharArray[i])) {
                i++;
            }
            while (i < j && !vowelSet.contains(sCharArray[j])) {
                j--;
            }
            if (i < j) {
                char temp = sCharArray[i];
                sCharArray[i] = sCharArray[j];
                sCharArray[j] = temp;
                i++;
                j--;
            }
        }
        return new String(sCharArray);
    }
}

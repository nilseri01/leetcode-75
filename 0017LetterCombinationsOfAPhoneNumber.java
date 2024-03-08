// https://leetcode.com/problems/letter-combinations-of-a-phone-number
class Solution {
    private static final String[] digitToLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        result.add("");
        for (char d : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String s : result) {
                char[] digitLetters = digitToLetters[d - '0'].toCharArray();
                for (char c : digitLetters) {
                    temp.add(s + c);
                }
            }
            result = temp;
        }

        return result;
    }
}

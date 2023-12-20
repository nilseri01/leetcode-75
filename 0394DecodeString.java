// https://leetcode.com/problems/decode-string
class Solution {
    public String decodeString(String s) {
        Stack<Pair<StringBuilder, Integer>> stack = new Stack<>();

        StringBuilder charGroup = new StringBuilder();
        int charCount = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                charCount = charCount * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(new Pair<>(charGroup, charCount));

                charGroup = new StringBuilder();
                charCount = 0;
            } else if (c == ']') {
                Pair<StringBuilder, Integer> pair = stack.pop();

                StringBuilder previousCharGroup = pair.getKey();
                int previousCount = pair.getValue();

                charGroup = previousCharGroup.append(generateRepeatedString(charGroup, previousCount));
            } else {
                charGroup.append(c);
            }
        }

        return charGroup.toString();
    }

    private StringBuilder generateRepeatedString(StringBuilder s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb;
    }
}

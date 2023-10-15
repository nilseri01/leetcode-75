// https://leetcode.com/problems/removing-stars-from-a-string
class Solution {
    public String removeStars(String s) {
        Stack<Character> charStack = new Stack<>();
        charStack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '*' && !charStack.isEmpty()) {
                charStack.pop();
            } else {
                charStack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        charStack.stream().forEach(c -> sb.append(c));
        return sb.toString();
    }
}

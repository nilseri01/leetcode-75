// https://leetcode.com/problems/determine-if-two-strings-are-close
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> letterCountMap1 = new HashMap<>();
        Map<Character, Integer> letterCountMap2 = new HashMap<>();

        word1.chars().forEach(c -> letterCountMap1.merge((char) c, 1, Integer::sum));
        word2.chars().forEach(c -> letterCountMap2.merge((char) c, 1, Integer::sum));

        if (!letterCountMap1.keySet().equals(letterCountMap2.keySet())) {
            return false;
        }

        List<Integer> letterFreqList1 = new ArrayList<>(letterCountMap1.values());
        List<Integer> letterFreqList2 = new ArrayList<>(letterCountMap2.values());

        Collections.sort(letterFreqList1);
        Collections.sort(letterFreqList2);
        return letterFreqList1.equals(letterFreqList2);
    }
}

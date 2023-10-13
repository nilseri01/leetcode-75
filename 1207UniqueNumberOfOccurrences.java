// https://leetcode.com/problems/unique-number-of-occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> valueCountMap = new HashMap<>();
        Arrays.stream(arr).forEach(num -> valueCountMap.merge(num, 1, Integer::sum));
        return (new HashSet<>(valueCountMap.values())).size() == valueCountMap.size();
    }
}

// https://leetcode.com/problems/maximum-subsequence-score
class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long maxScore = 0;

        int n = nums1.length;
        Pair<Integer, Integer>[] pairArray = new Pair[n];
        for (int i = 0; i < n; ++i) {
            pairArray[i] = new Pair<>(nums2[i], nums1[i]);
        }
        Arrays.sort(pairArray, (a, b) -> Integer.compare(b.getKey(), a.getKey())); // sort by nums2 desc

        long sum = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (Pair<Integer, Integer> pair : pairArray) {
            int num2 = pair.getKey();
            int num1 = pair.getValue();

            minHeap.offer(num1);
            sum += num1;

            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }
            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }
        return maxScore;
    }
}

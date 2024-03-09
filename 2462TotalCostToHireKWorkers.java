// https://leetcode.com/problems/total-cost-to-hire-k-workers
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long result = 0;

        Queue<Integer> minHeapL = new PriorityQueue<>();
        Queue<Integer> minHeapR = new PriorityQueue<>();

        int ii = 0, jj = costs.length - 1;
        for (int i = 0; i < k; i++) {
            while (minHeapL.size() < candidates && ii <= jj) {
                minHeapL.offer(costs[ii]);
                ii++;
            }
            while (minHeapR.size() < candidates && ii <= jj) {
                minHeapR.offer(costs[jj]);
                jj--;
            }

            if (minHeapL.isEmpty()) {
                result += minHeapR.poll();
            } else if (minHeapR.isEmpty()) {
                result += minHeapL.poll();
            } else if (minHeapL.peek() <= minHeapR.peek()) {
                result += minHeapL.poll();
            } else {
                result += minHeapR.poll();
            }    
        }

        return result;
    }
}

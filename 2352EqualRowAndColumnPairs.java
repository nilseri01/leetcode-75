// https://leetcode.com/problems/equal-row-and-column-pairs
class Solution {
    public int equalPairs(int[][] grid) {
        int pairCount = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = 0;
                while (k < n && grid[i][k] == grid[k][j]) {
                    k++;
                }
                if (k == n) {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}

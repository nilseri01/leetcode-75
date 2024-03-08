// https://leetcode.com/problems/combination-sum-iii
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int k, int n, int startNumber, List<Integer> addendList, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(addendList));
            return;
        }

        if (k == 0 || n < 0) {
            return;
        }

        for (int i = startNumber; i <= 9; ++i) {
            addendList.add(i);
            dfs(k - 1, n - i, i + 1, addendList, result);
            addendList.remove(addendList.size() - 1);
        }
    }
}

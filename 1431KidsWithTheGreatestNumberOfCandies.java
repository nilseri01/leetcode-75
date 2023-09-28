// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandiesCount = 0;
        for (int candyCount: candies) {
            if (candyCount > maxCandiesCount) {
                maxCandiesCount = candyCount;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int candyCount: candies) {
             result.add((candyCount + extraCandies) >= maxCandiesCount);
        }
        return result;
    }
}

// https://leetcode.com/problems/koko-eating-bananas
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxValueInPiles = Arrays.stream(piles).max().getAsInt();

        int k = 1;
        while (k < maxValueInPiles) {
            int mid = (k + maxValueInPiles) / 2;
            if (eatHours(piles, mid) <= h) {
                maxValueInPiles = mid;
            } else {
                k = mid + 1;
            }      
        }

        return k;
    }

    private int eatHours(int[] piles, int k) {
        return Arrays.stream(piles).reduce(0, (subtotal, pile) -> subtotal + ((pile - 1) / k) + 1); // Math.ceil(pile / k)
    }
}

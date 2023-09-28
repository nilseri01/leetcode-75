// https://leetcode.com/problems/can-place-flowers
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            int adjFlowerCount = flowerbed[i];
            adjFlowerCount += (i > 0 ? flowerbed[i - 1] : 0);
            adjFlowerCount += (i < (flowerbed.length - 1) ? flowerbed[i + 1] : 0);
            
            if (adjFlowerCount == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return (n == 0);
    }
}

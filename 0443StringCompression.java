// https://leetcode.com/problems/string-compression
class Solution {
    public int compress(char[] chars) {
        int compressedIndex = -1;
        int i = 0, j = 1;
        while (i < chars.length) {
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            compressedIndex++;
            chars[compressedIndex] = chars[i];
            char[] counterCharVal = String.valueOf(j - i).toCharArray();
            for (int k = 0; (j - i) > 1 && k < counterCharVal.length; k++) {
                if (compressedIndex + 1 >= chars.length) {
                    return chars.length;
                }
                compressedIndex++;
                chars[compressedIndex] = counterCharVal[k];
            }
            i = j;
            j++;
        }
        if (compressedIndex <= chars.length - 1) {
            Arrays.copyOfRange(chars, 0, compressedIndex);
        }
        return compressedIndex + 1;
    }
}

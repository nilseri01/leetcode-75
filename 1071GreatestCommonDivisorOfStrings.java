// https://leetcode.com/problems/greatest-common-divisor-of-strings
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int str1Length = str1.length(), str2Length = str2.length();
        int maxDivisorStrLength = Math.min(str1Length, str2Length);
        for (int i = maxDivisorStrLength; i > 0; i--) {
            if (str1Length % i == 0 && 
                str2Length % i == 0 && 
                str1.substring(0, i).equals(str2.substring(0, i))) {
                return str1.substring(0, i);
            }
        }
        
        return "";
    }
}

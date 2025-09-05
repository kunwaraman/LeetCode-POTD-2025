/*
time complexity: O(num1)
space complexity: O(1)
 */

public class Leetcode2749 {
    class Solution {
        public int makeTheIntegerZero(int num1, int num2) {
            int t=0;
            while(true){
                long val=(long)num1-(long)t*num2;
                if(val<0){
                    return -1;
                }
                if(Long.bitCount(val)<=t && t<=val){
                    return t;
                }
                t++;
            }

        }
    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */

public class LongestBinarySequenceLessThanOrEqualToK {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        long powervalue=1;
        int length=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                length++;
            }else if(powervalue<=k){
                k-=powervalue;
                length++;
            }
            if(powervalue<=k){
                powervalue=(powervalue*2);
            }

        }
        return length;
    }
}

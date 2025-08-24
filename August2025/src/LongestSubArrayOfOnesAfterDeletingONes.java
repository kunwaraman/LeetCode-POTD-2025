/*
time complexity: O(n)
space complexity: O(1)
 */

public class LongestSubArrayOfOnesAfterDeletingONes {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int maxlen=0;
        int cntzero=0;
        while(j<n){
            if(nums[j]==0){
                cntzero++;
            }
            if(cntzero>1){
                while(cntzero>1){
                    if(nums[i]==0){
                        cntzero--;
                    }
                    i++;
                }
            }
            maxlen=Math.max(maxlen,j-i);
            j++;
        }
        return maxlen;

    }
}

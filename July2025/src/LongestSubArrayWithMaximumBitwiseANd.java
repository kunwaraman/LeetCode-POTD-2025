/*
time complexity: O(n)
space complexity: O(1)
 */

public class LongestSubArrayWithMaximumBitwiseANd {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxlen=0;
        int res=0;
        int maxval=0;
        for(int i=0;i<n;i++){
            if(nums[i]>maxval){
                maxval=nums[i];
                res=0;
                maxlen=0;
            }
            if(nums[i]==maxval){
                maxlen++;
            }else{
                maxlen=0;
            }
            res=Math.max(res,maxlen);
        }
        return res;
    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */

public class MaximumValueOfAnOrderedTripletII {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res=0;
        long maxdiff=0;
        long maxi=0;
        for(int k=0;k<n;k++){
            res=Math.max(res,maxdiff*nums[k]);
            maxdiff=Math.max(maxdiff,maxi-nums[k]);
            maxi=Math.max(maxi,(long) nums[k]);
        }
        return res;
    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */
public class CountSubArraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long ans = 0;
        long j = -1;
        long jmin = -1;
        long jmax = -1;
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK) {
                j = i;
            }
            if(nums[i]==minK){
                jmin = i;
            }
            if(nums[i]==maxK){
                jmax=i;
            }
            ans+=Math.max(0L,Math.min(jmin,jmax)-j);
        }
        return ans;
    }
}

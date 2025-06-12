/*
time complexity: O(n)
space complexity: O(1)
 */
public class Leetcode3423 {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxm=0;
        for(int i=0;i<n;i++){
            maxm=Math.max(maxm,Math.abs(nums[i]-nums[(i+1)%n]));
        }
        return maxm;
    }
}

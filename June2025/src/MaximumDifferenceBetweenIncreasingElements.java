/*
time complexity: O(n)
space complexity: O(1)  
 */

public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxele=-1;
        int minele=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>minele){
                maxele=Math.max(maxele,nums[i]-minele);
            }else{
                minele=nums[i];
            }
        }
        return maxele;
    }
}

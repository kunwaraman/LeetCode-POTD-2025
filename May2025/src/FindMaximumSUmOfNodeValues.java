/*
time complexity: O(n)
space complexity: O(1)
 */
public class FindMaximumSUmOfNodeValues {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        long sum=0;
        int count=0;
        int minloss=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if((nums[i]^k)>nums[i]){
                count++;
                sum+=(nums[i]^k);
            }else{
                sum+=nums[i];
            }
            minloss=Math.min(minloss,Math.abs(nums[i]-(nums[i]^k)));
        }
        if(count%2==0){
            return sum;
        }
        return sum-minloss;
    }
}

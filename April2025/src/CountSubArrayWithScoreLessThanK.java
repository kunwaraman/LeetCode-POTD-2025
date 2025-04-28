/*
time complexity: O(n)
space complexity: O(1)
 */

public class CountSubArrayWithScoreLessThanK {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long ans=0;
        int i=0;
        int j=0;
        long sum=0;
        long score=0;
        while(j<n){
            sum+=nums[j];
            score=sum*(j-i+1);
            if(score>=k){
                while(score>=k){
                    sum=sum-nums[i];
                    i++;
                    score=sum*(j-i+1);
                }
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}

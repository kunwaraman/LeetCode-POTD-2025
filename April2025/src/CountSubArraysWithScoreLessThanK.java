import java.util.*;
/*
time complexity: O(n)
space complexity: O(1)

 */
public class CountSubArraysWithScoreLessThanK {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxele=Arrays.stream(nums).max().getAsInt();
        int i=0;
        int j=0;
        long ans=0;
        long maxcount=0;
        while(j<n){
            if(nums[j]==maxele){
                maxcount++;
            }
            if(maxcount>=k){
                while(maxcount>=k){
                    ans+=(n-j);
                    if(nums[i]==maxele){
                        maxcount--;
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}

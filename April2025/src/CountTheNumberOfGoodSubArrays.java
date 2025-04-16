import java.util.*;
/*
time complexity O(n)
space complexity O(n)
 */

public class CountTheNumberOfGoodSubArrays {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        long ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        long pair=0;
        while(j<n){
            pair+=map.getOrDefault(nums[j],0);
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(pair>=k){
                ans+=(n-j);
                map.put(nums[i],map.get(nums[i])-1);
                pair-=map.get(nums[i]);
                i++;
            }
            j++;
        }
        return ans;

    }
}

import java.util.*;
/*
time complexity: O(nlogn)
space complexity: O(logn)
 */
public class PartitionArraySuchThatMaximumDIfferenceIsK {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int minval=nums[0];
        int count=1;
        for(int i=0;i<n;i++){
            if(nums[i]-minval>k){
                count++;
                minval=nums[i];
            }
        }
        return count;
    }
}

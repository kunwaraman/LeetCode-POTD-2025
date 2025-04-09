import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */

public class MinimumOperationsToMakeArrayValuesEqualTOK {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]<k){
                return -1;
            }else if(nums[i]>k){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}

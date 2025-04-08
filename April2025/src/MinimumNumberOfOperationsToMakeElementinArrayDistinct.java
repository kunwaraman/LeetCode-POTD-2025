import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class MinimumNumberOfOperationsToMakeElementinArrayDistinct {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(set.contains(nums[i])){
                return (int)Math.ceil((i+1)/3.0);

            }
            set.add(nums[i]);
        }
        return 0;
    }
}

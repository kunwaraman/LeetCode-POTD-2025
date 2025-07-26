import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class MaximumUniqueSubArraySumAfterDeletion {
    public int maxSum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int neg=Integer.MIN_VALUE;
        int sum=0;
        for(int val:nums){
            if(val<=0){
                neg=Math.max(neg,val);
            }else if(!set.contains(val)){
                sum+=val;
                set.add(val);
            }
        }
        if(sum==0){
            return neg;
        }
        return sum;
    }
}

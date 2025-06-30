/*
time complexity: O(n*2^n)
space complexity: O(n)

 */
import java.util.*;


public class NumberOFSequenceThatSatisfiesTheGivenKSum {
    int mod = 1_000_000_007;
    int count=0;
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        recur(nums,list,0,target);
        return count;
    }
    public void recur(int nums[],List<Integer> list,int index,int target){
        int n = nums.length;
        if(index>=n){
            if(!list.isEmpty()){
                int minm=Collections.min(list);
                int maxm=Collections.max(list);
                if(minm+maxm<=target){
                    count=(count+1)%mod;

                }
            }
            return;
        }
        list.add(nums[index]);
        recur(nums,list,index+1,target);
        list.remove(list.size()-1);
        recur(nums,list,index+1,target);
    }
}

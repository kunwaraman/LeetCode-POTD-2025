import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */


public class LongestHarmoniousSequence {
    public int findLHS(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int i=0;i<n;i++){
            int minm=nums[i];
            int maxm=nums[i]+1;
            if(map.containsKey(maxm)){
                res=Math.max(res,map.get(minm)+map.get(maxm));
            }
        }
        return res;
    }
}

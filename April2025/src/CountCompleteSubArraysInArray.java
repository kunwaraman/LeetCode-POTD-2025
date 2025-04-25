import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class CountCompleteSubArraysInArray {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int i=0;
        int j=0;
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.size()>=set.size()){
                while(map.size()>=set.size()){
                    ans+=(n-j);
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0){
                        map.remove(nums[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}

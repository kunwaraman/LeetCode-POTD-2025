/*
time complexity: O(n)
space complexity: O(n)
 */
import java.util.*;
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int i=0;
        int j=0;
        int maxsum=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(map.size()==j-i+1){
                maxsum=Math.max(maxsum,sum);
            }
            if(map.size()<j-i+1){
                while(j-i+1>map.size()){
                    sum-=nums[i];
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0){
                        map.remove(nums[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return maxsum;
    }
}

import java.util.*;
/*
time complexity: O(n)
space complexity: O(m)
 */

public class FindingpairsWithCertainSum {
    int nums1[];
    int nums2[];
    HashMap<Integer,Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int val:nums2){
            map.put(val,map.getOrDefault(val,0)+1);
        }
    }

    public void add(int index, int val) {
        int oldval=nums2[index];
        map.put(oldval,map.get(oldval)-1);
        if(map.get(oldval)==0){
            map.remove(oldval);
        }
        nums2[index]+=val;
        int newval=nums2[index];
        map.put(newval,map.getOrDefault(newval,0)+1);

    }

    public int count(int tot) {
        int count=0;
        int n = nums1.length;
        for(int i=0;i<n;i++){
            int rem=tot-nums1[i];
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
        }
        return count;
    }
}

import java.util.*;
/*
time complexity: O(n*k+nlogn);
space complexity: O(n)
 */

public class FindAllKDistantIndicesInAnArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int j=0;j<n;j++){
            if(nums[j]==key){
                int start=j-k;
                int end=j+k;
                if(j-k<0){
                    start=0;
                }
                if(j+k>n-1){
                    end=n-1;
                }
                // int end=Math.min(n-1,j+k);
                for(int i=start;i<=end;i++){
                    set.add(i);
                }
            }
        }
        for(int st:set){
            list.add(st);
        }
        Collections.sort(list);
        return list;
    }
}

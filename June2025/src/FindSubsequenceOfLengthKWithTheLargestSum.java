import java.util.*;
/*
time complexity: O(nlogn)
space complexity: O(n)
 */

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        if(k==n){
            return nums;
        }
        int ans[][] = new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=i;
            ans[i][1]=nums[i];
        }
        Arrays.sort(ans,(a,b)->Integer.compare(b[1],a[1]));
        Arrays.sort(ans,0,k,Comparator.comparingInt(a->a[0]));
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=ans[i][1];
        }
        return res;
    }
}

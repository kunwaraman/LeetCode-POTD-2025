import java.util.*;
/*
time complexity: O(n*maxor)
space complexity: O(n*maxor)
 */


public class CountNumberOfMaximumBitwiseOrSubsets {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxor=0;
        for(int val:nums){
            maxor=maxor|val;
        }
        int dp[][] = new int[n+1][maxor+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return recur(nums,0,0,maxor,dp);
    }
    public int recur(int[] nums,int index,int currxor,int maxor,int dp[][]){
        int n = nums.length;
        if(index==n){
            if(currxor==maxor){
                return 1;
            }
            return 0;
        }
        if(dp[index][currxor]!=-1){
            return dp[index][currxor];
        }
        int take=recur(nums,index+1,currxor|nums[index],maxor,dp);
        int nontake=recur(nums,index+1,currxor,maxor,dp);
        return dp[index][currxor]= take+nontake;
    }
}

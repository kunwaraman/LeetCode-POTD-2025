import java.util.*;
/*
time conplexity: O(2^n)
space complexity: O(n*m)
 */
public class PartitionEqualSubsetSum {
    int dp[][] = new int[201][20001];
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        if(sum%2!=0){
            return false;
        }
        int x=sum/2;
        return recur(list,0,x);
    }
    public boolean recur(List<Integer>nums,int i,int x){
        int n = nums.size();
        if(x==0){
            return true;
        }
        if(i>=n){
            return false;
        }
        if(dp[i][x]!=-1){
            return dp[i][x]==1;
        }
        boolean take=false;

        if(nums.get(i)<=x){
            take=recur(nums,i+1,x-nums.get(i));
        }
        boolean nontake=recur(nums,i+1,x);
        dp[i][x] = (take || nontake) ? 1 : 0;
        return take || nontake;
    }
}

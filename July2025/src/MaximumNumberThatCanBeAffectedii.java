import java.util.*;
/*
time complexity: O(n*logn)
space complexity: O(n*k)
 */

public class MaximumNumberThatCanBeAffectedii {
    public int maxValue(int[][] events, int k) {
        int n = events.length;
        int dp[][] = new int[n+1][k+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        return recur(events,k,0,dp);
    }
    public int recur(int[][] events,int k,int index,int dp[][]){
        int n = events.length;
        if(index>=n || k==0){
            return 0;
        }
        if(dp[index][k]!=-1){
            return dp[index][k];
        }
        int nontake=recur(events,k,index+1,dp);

        int j=index+1;
        for(;j<n;j++){
            if(events[j][0]>events[index][1]){
                break;
            }
        }
        int take=events[index][2]+recur(events,k-1,j,dp);
        return dp[index][k]= Math.max(take,nontake);

    }
}

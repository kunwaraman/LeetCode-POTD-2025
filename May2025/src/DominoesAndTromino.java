import java.util.*;
/*
time complexity: O(n)
space complexity: O(1) /// 10001 space
 */
public class DominoesAndTromino {
    int dp[] = new int[1001];
    int M=1000000007;
    public int numTilings(int n) {
        Arrays.fill(dp,-1);
        return recur(n);
    }
    public int recur(int n){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==3){
            return 5;
        }

        return dp[n]= (2*recur(n-1)%M + recur(n-3)%M)%M;
    }
}

/*
time complexity: O(2^n)
space complexity: O(n)
 */
import java.util.*;
public class SolvingQuestionsWithBrainPower {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long dp[] = new long[n+1];
        Arrays.fill(dp,-1);
        return recur(questions,0,dp);
    }
    public long recur(int questions[][],int i,long dp[]){
        int n = questions.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long take=questions[i][0]+recur(questions,i+questions[i][1]+1,dp);
        long nontake=recur(questions,i+1,dp);
        return dp[i]= Math.max(take,nontake);
    }
}

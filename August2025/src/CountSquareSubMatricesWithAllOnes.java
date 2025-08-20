/*
time complexity O(m*n)
space complexity O(m*n)
 */
import java.util.*;

public class CountSquareSubMatricesWithAllOnes {
    int dp[][] = new int[301][301];
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res=0;
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    res+=recur(matrix,i,j);
                }
            }
        }
        return res;
    }
    public int recur(int matrix[][],int i,int j){
        int m = matrix.length;
        int n = matrix[0].length;
        if(i>=m || j>=n){
            return 0;
        }
        if(matrix[i][j]==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = recur(matrix,i+1,j);
        int rgt= recur(matrix,i,j+1);
        int diag=recur(matrix,i+1,j+1);
        return dp[i][j]= 1+Math.min(down,Math.min(rgt,diag));
    }
}

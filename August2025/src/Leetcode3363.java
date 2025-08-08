import java.util.*;
/*
time complexity: O(n^2)
space complexity: O(n^2)
 */

public class Leetcode3363 {
    int dptwo[][];
    int dpthree[][];
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        dptwo=new int[n][n];
        for(int d[]:dptwo){
            Arrays.fill(d,-1);
        }
        dpthree= new int[n][n];
        for(int dp[]:dpthree){
            Arrays.fill(dp,-1);
        }
        int cone=childone(fruits);
        int ctwo=childtwo(fruits,0,n-1);
        int cthree=childthree(fruits,n-1,0);
        return cone+ctwo+cthree;

    }
    public int childone(int[][] fruits){
        int n = fruits.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=fruits[i][i];
            fruits[i][i]=0;
        }
        return count;
    }
    public int childtwo(int fruits[][],int i,int j){
        int n = fruits.length;
        if(i<0 || i>=n ||  j<0 || j>=n){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 0;
        }
        if(i==j || i>j){
            return 0;
        }
        if(dptwo[i][j]!=-1){
            return dptwo[i][j];
        }
        int blft=fruits[i][j]+childtwo(fruits,i+1,j-1);
        int bdown=fruits[i][j]+childtwo(fruits,i+1,j+1);
        int brgt=fruits[i][j]+childtwo(fruits,i+1,j);
        return dptwo[i][j]= Math.max(blft,Math.max(bdown,brgt));
    }
    public int childthree(int fruits[][],int i,int j){
        int n = fruits.length;
        if(i<0 || i>=n || j<0 || j>=n){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 0;
        }
        if(i==j || i<j){
            return 0;
        }
        if(dpthree[i][j]!=-1){
            return dpthree[i][j];
        }
        int blft=fruits[i][j]+childthree(fruits,i-1,j+1);
        int brgt=fruits[i][j]+childthree(fruits,i+1,j+1);
        int bdown=fruits[i][j]+childthree(fruits,i,j+1);
        return dpthree[i][j]= Math.max(blft,Math.max(brgt,bdown));
    }
}

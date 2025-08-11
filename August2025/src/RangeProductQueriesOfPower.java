/*
time complexity: O(n)
space complexity: O(n)
 */

public class RangeProductQueriesOfPower {
    int M=(int)(1e9 + 7);
    public int[] productQueries(int n, int[][] queries) {
        int powers[] = new int[32];
        int idx=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                powers[idx]=(1<<i);
                idx++;
            }
        }
        int ans[] = new int[queries.length];
        int idx1=0;
        for(int query[]:queries){
            int start=query[0];
            int end=query[1];
            long prod=1;
            for(int i=start;i<=end;i++){
                prod=(prod*powers[i])%M;
            }
            ans[idx1]=(int)prod;
            idx1++;

        }
        return ans;
    }
}

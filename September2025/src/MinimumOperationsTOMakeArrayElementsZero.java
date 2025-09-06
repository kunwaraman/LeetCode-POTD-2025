/*
time complexity: O(n*log(r);
space complexity: O(1);
 */


public class MinimumOperationsTOMakeArrayElementsZero {

        public long minOperations(int[][] queries) {
            int n = queries.length;
            long res=0;
            for(int query[]:queries){
                int l=query[0];
                int r=query[1];

                long step=stcnt(l,r);
                res+=(step+1)/2;
            }
            return res;
        }
        public long stcnt(int l,int r){
            long L=1; // r = 4*l-1;
            long step=1;
            long steps=0;
            while(L<=r){
                long R=4*L-1;
                long start=Math.max(L,(long)l);
                long end=Math.min(R,(long) r);
                if(start<=end){
                    steps+=(end-start+1)*step;
                }
                step+=1;
                L=L*4;

            }
            return steps;
        }

}

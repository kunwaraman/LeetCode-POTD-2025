/*
time complexity: O(n)
space complexity: O(1)
 */
public class MinimumDominoRotationForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = Integer.MAX_VALUE;
        for(int val=1;val<=6;val++){
            int swap=find(tops,bottoms,val);
            if(swap!=-1){
                ans=Math.min(ans,swap);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    public int find(int top[],int bottom[],int val){
        int n = bottom.length;
        int topswap=0;
        int bottomswap=0;
        for(int i=0;i<n;i++){
            if(top[i]!=val && bottom[i]!=val){
                return -1;
            }else if(top[i]!=val){
                topswap++;
            }else if(bottom[i]!=val){
                bottomswap++;
            }
        }
        return Math.min(topswap,bottomswap);
    }
}

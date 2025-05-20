/*
time complexity: O(q+n);
space complexity: O(n);
 */
public class ZeroArrayTransFormationI {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int diff[] = new int[n];
        for(int query[]:queries){
            int lft=query[0];
            int rgt=query[1];
            int x=1;
            diff[lft]+=x;
            if(rgt+1<n){
                diff[rgt+1]-=x;
            }
        }
        int csum=0;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            csum+=diff[i];
            res[i]=csum;
        }
        for(int i=0;i<n;i++){
            if(res[i]<nums[i]){
                return false;
            }
        }
        return true;
    }
}

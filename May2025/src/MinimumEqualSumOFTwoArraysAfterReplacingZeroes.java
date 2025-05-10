/*
time complexity: O(n+m)
space complexity: O(1)
 */
public class MinimumEqualSumOFTwoArraysAfterReplacingZeroes {
    public long minSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        long sum1=0;
        long sum2=0;
        long zero1=0;
        long zero2=0;
        for(int i=0;i<n;i++){
            sum1+=nums1[i];
            if(nums1[i]==0){
                zero1++;
                sum1+=1;
            }
        }
        for(int i=0;i<m;i++){
            sum2+=nums2[i];
            if(nums2[i]==0){
                zero2++;
                sum2+=1;
            }
        }
        if((sum1>sum2 && zero2==0) || (sum1<sum2 && zero1==0)){
            return -1;
        }
        return Math.max(sum1,sum2);
    }
}

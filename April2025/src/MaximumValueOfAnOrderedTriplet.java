/*
time complexity: O(n^3)
space complexity: O(1)
 */

public class MaximumValueOfAnOrderedTriplet {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    //  if(i<j && j<k)
                    long ans=(long)(nums[i]-nums[j])*nums[k];
                    maxi=Math.max(maxi,ans);

                }
            }
        }
        return maxi;

    }
}

import java.util.*;
/*
time complexity: O(NLogN+NLogD)WhereDIsTheRangeOfPossibleMaximumDifferences
space complexity: O(1)
 */
public class MinimizeTheMaximumDifferenceOfPairs {
    public int minimizeMax(int[] nums, int p) {
        int n= nums.length;
        Arrays.sort(nums);
        int start=0;
        int end=nums[n-1]-nums[0];
        int res=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(nums,mid,p)){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public boolean isvalid(int nums[],int mid,int p){
        int n = nums.length;
        int i=0;
        int countpairs=0;
        while(i<n-1){ // we acces i+1 also so we have to do n-1 for out of bond
            if(nums[i+1]-nums[i]<=mid){
                countpairs++;
                i+=2;
            }else{
                i++;
            }

        }
        if(countpairs>=p){
            return true;
        }
        return false;
    }
}

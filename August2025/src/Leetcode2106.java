/*
time complexity: O(k*long(n))
space complexity: O(n)
 */

public class Leetcode2106 {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int prefixsum[] = new int[n];
        int posit[] = new int[n];
        for(int i=0;i<n;i++){
            posit[i]=fruits[i][0];
            prefixsum[i]=fruits[i][1]+(i>0 ?prefixsum[i-1]:0);
        }
        int maxfrt=0;
        for(int d=0;d<=k/2;d++){
            int remain=k-2*d;
            int i=startPos-d;
            int j=startPos+remain;

            int left=lowerbound(posit,i);
            int right=upperbound(posit,j)-1;

            if(left<=right){
                int total=prefixsum[right]-(left>0 ? prefixsum[left-1]:0);
                maxfrt=Math.max(maxfrt,total);
            }
            // case 2 moved d to the right hand side
            i=startPos-remain;
            j=startPos+d;
            left=lowerbound(posit,i);
            right=upperbound(posit,j)-1;

            if(left<=right){
                int total=prefixsum[right]-(left>0 ? prefixsum[left-1]:0);
                maxfrt=Math.max(maxfrt,total);
            }
        }
        return maxfrt;
    }
    public int lowerbound(int nums[],int target){
        int n = nums.length;
        int start=0;
        int end = n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    public int upperbound(int nums[],int target){
        int n = nums.length;
        int start=0;
        int end = n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}

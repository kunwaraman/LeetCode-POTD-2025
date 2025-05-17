/*
time complexity: O(n)
space complexity: O(1)
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int k= n-1;
        while(j<=k){
            if(nums[j]==1){
                j++;
            }else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
    }
    public void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */

public class FindNumberWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(digit(nums[i])%2==0){
                cnt++;
            }
        }
        return cnt;
    }

    public int digit(int num){
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;
        }
        return cnt;
    }
}

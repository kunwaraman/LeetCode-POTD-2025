/*
time complexity: O(n)
space complexity: O(1)
 */


public class Leetcode3201 {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int even=0;
        int odd=0;
        int alternate=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int parity=nums[0]%2;
        for(int i=1;i<n;i++){
            int currprty=nums[i]%2;
            if(currprty!=parity){
                alternate++;
            }
            parity=currprty;
        }
        return Math.max(even,Math.max(odd,alternate));

    }
}

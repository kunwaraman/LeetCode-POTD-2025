/*
time complexity: O(n*log(max))
space complexity: O(n)
 */
import java.util.*;
public class ReplaceNonCOPrimeNumberInAnArray {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(!list.isEmpty()){
                int prev=list.get(list.size()-1);
                int curr=nums[i];
                int g=gcd(prev,curr);
                if(g==1){
                    break;
                }
                list.remove(list.size()-1);
                long lcm=(long)prev/g*nums[i];
                nums[i]=(int)lcm;
            }
            list.add(nums[i]);
        }
        return list;
    }
    public int gcd(int a,int b){
        return b==0 ? a: gcd(b,a%b);
    }
}

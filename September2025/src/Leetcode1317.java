/*
time  complexity: O(n*logn)
space complexity: O(1)
 */
public class Leetcode1317 {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n-1;i++){
            int b=n-i;
            if(check(i) && check(b)==true){
                return new int[]{i,b};
            }
        }
        return new int[]{};
    }
    public boolean check(int num){
        while(num>0){
            if(num%10==0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}

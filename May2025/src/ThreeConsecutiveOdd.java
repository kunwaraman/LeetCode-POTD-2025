/*
time complexity: O(n)
space complexity: O(1)
 */
public class ThreeConsecutiveOdd {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int codd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                codd++;
            }else{
                codd=0;
            }
            if(codd==3){
                return true;
            }
        }
        return false;
    }
}

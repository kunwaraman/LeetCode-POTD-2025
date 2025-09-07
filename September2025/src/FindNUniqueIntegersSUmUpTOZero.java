/*
time complexity: O(n)
space complexity: O(1000) consider as a constant
 */

public class FindNUniqueIntegersSUmUpTOZero {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int i=0;
        int j=n-1;
        int start=1;
        while(i<j){
            ans[i]=start;
            ans[j]=-start;
            i++;
            j--;
            start++;
        }
        return ans;
    }
}

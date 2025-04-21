/*
time complexity : O(n)
space complexity: O(1)
 */

public class CountTheHiddenSequence {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;
        int curr=0;
        int minval=0;
        int maxval=0;
        for(int i=0;i<n;i++){
            curr=curr+differences[i];
            minval=Math.min(minval,curr);
            maxval=Math.max(maxval,curr);

            if((upper-maxval)-(lower-minval)+1<=0){
                return 0;
            }
        }
        return (upper-maxval)-(lower-minval)+1;
    }
}

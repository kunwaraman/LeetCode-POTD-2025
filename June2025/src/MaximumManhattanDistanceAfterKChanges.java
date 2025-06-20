/*
time complexity: O(n)
space complexity: O(1)
 */

public class MaximumManhattanDistanceAfterKChanges {
    public int maxDistance(String s, int k) {
        int n = s.length();
        int maxmd=0;
        int east=0;
        int north=0;
        int south=0;
        int west=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='N'){
                north++;
            }else if(s.charAt(i)=='S'){
                south++;
            }else if(s.charAt(i)=='E'){
                east++;
            }else{
                west++;
            }

            int currmd=Math.abs(east-west)+Math.abs(north-south);
            int steps=i+1;
            int wasted=steps-currmd;
            int extra=0;
            if(wasted!=0){ // best case
                extra=Math.min(2*k,wasted);

            }
            int finalcurrmd=currmd+extra;
            maxmd=Math.max(maxmd,finalcurrmd);
        }
        return maxmd;

    }
}

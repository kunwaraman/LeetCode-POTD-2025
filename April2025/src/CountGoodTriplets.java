/*
time complexity: O(n^3)
space complexity: O(1)
 */

public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count=0;
        for(int i=0;i<=n-3;i++){
            for(int j=i+1;j<=n-2;j++){
                for(int k=j+1;k<=n-1;k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

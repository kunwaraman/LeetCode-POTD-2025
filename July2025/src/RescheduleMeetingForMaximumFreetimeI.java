/*
time complexity: O(n)
space complexity: O(n)
 */

public class RescheduleMeetingForMaximumFreetimeI {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int free[] = new int[n+1];
        free[0]=startTime[0];
        for(int i=1;i<n;i++){
            free[i]=startTime[i]-endTime[i-1];
        }
        free[n]=eventTime-endTime[n-1];
        int i=0;
        int j=0;
        int maxsum=0;
        int currsum=0;
        int m=free.length;
        while(j<m){
            currsum+=free[j];
            if(j-i+1>k+1){
                while(i<n && j-i+1>k+1){
                    currsum-=free[i];
                    i++;
                }
            }
            maxsum=Math.max(maxsum,currsum);
            j++;

        }
        return maxsum;

    }
}

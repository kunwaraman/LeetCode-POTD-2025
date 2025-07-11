/*
time complexity: O(m*n);
space complexity: O(n);
 */
import java.util.*;
public class MeetingsRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        int m = meetings.length;
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        long[] lastavail=new long[n];
        int[] roomusedcnt=new int[n];
        for(int met[]:meetings){
            int start=met[0];
            int end=met[1];
            int durat=end-start;
            boolean found=false;
            long earlyendroomtime=Long.MAX_VALUE;
            int earlyendroom=0;
            // find first available room for my current meeting
            for(int room=0;room<n;room++){
                if(lastavail[room]<=start){
                    lastavail[room]=end;
                    roomusedcnt[room]++;
                    found=true;
                    break;
                }
                if(lastavail[room]<earlyendroomtime){
                    earlyendroomtime=lastavail[room];
                    earlyendroom=room;
                }

            }
            // i could not fina any room
            if(!found){
                // pick that room which will end first
                lastavail[earlyendroom]+=durat;
                roomusedcnt[earlyendroom]++;


            }
        }
        int resroom=-1;
        int maxuse=0;
        for(int room=0;room<n;room++){
            if(roomusedcnt[room]>maxuse){
                maxuse=roomusedcnt[room];
                resroom=room;
            }
        }
        return resroom;

    }
}

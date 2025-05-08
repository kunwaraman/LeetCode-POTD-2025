import java.util.*;
/*
time complexity: O(MnLog(Mn))
space complexity: O(Mn)
 */
public class FindMinimumTImeToReachLastRoomII {
    int direct[][]={{0,1},{1,0},{0,-1},{-1,0}};
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int ans[][] = new int[m][n];
        for(int an[]:ans){
            Arrays.fill(an,Integer.MAX_VALUE);
        }
        ans[0][0]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){// worst case O(m*n)
            // pq.push add log(mn)
            int curr[] = pq.remove();
            int currtime=curr[0];
            int i=curr[1];
            int j=curr[2];
            if(i==m-1 && j==n-1){
                return currtime;
            }
            for(int dir[]:direct){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x>=0 && x<m && y>=0 && y<n){
                    int movecost=0;
                    if((x+y)%2==0){
                        movecost=2;
                    }else{
                        movecost=1;
                    }
                    int wait=moveTime[x][y]-currtime;
                    if(wait<0){
                        wait=0;
                    }
                    int finaltime=currtime+wait+movecost;
                    if(ans[x][y]>finaltime){
                        ans[x][y]=finaltime;
                        pq.add(new int[]{finaltime,x,y});
                    }
                }
            }
        }
        return -1;

    }
}

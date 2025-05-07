import java.util.*;
/*
time complexity: O(MnLog(Mn))
space complexity: O(Mn)
 */
public class FindMinimumTimeToReachLastRoom {
    int direct[][]={{0,1},{1,0},{0,-1},{-1,0}};
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int res[][] = new int[m][n];
        for(int rs[]:res){
            Arrays.fill(rs,Integer.MAX_VALUE);
        }
        // pq holds this entire as(time,i,j);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        res[0][0]=0;
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
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
                    int wait=Math.max(moveTime[x][y]-currtime,0);
                    int finaltime=currtime+wait+1;
                    if(res[x][y]>finaltime){
                        res[x][y]=finaltime;
                        pq.add(new int[]{finaltime,x,y});
                    }
                }
            }
        }
        return -1;
    }
}

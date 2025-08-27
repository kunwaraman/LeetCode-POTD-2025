/*
time complexity: O(m*n)
space complexity: O(m*n)
 */

public class LengthOfLongestVshapeddiagonalelement {
    int direct[][]={{1,1},{1,-1},{-1,-1},{-1,1}};
    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    boolean canturn=true;
                    for(int d=0;d<=3;d++){
                        res=Math.max(res,1+recur(i,j,d,true,2,grid));
                    }
                }
            }
        }
        return res;
    }
    public int recur(int i,int j,int d,boolean canturn,int val,int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        int i_=i+direct[d][0];
        int j_=j+direct[d][1];
        if(i_<0 || i_>=m || j_<0 || j_>=n || grid[i_][j_]!=val){
            return 0;
        }
        int keepmov=1+recur(i_,j_,d,canturn,val==2?0:2,grid);
        if(canturn==true){
            keepmov=Math.max(keepmov,1+recur(i_,j_,(d+1)%4,false,val==2?0:2,grid));
        }
        return keepmov;
    }
}

import java.util.*;
/*
time complexity: O(m*n)
space complexity: O(m*n)
 */

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ky=i+j;
                map.putIfAbsent(ky,new ArrayList<>());
                map.get(ky).add(mat[i][j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        boolean flip = true;
        for(int k=0;k<=m+n-2;k++){
            ArrayList<Integer> diag = map.get(k);
            if(diag==null){
                continue;
            }
            if(flip){
                Collections.reverse(diag);
            }
            list.addAll(diag);
            flip=!flip;
        }
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;

    }
}

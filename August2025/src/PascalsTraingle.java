import java.util.*;
/*
time complexity: O(Numrows
2
 )
space complexity: O(Numrows
2
 )
 */

public class PascalsTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> inside = new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    inside.add(1);
                }else{
                    int ans=list.get(i-1).get(j)+list.get(i-1).get(j-1);
                    inside.add(ans);
                }
            }
            list.add(inside);
        }
        return list;
    }
}

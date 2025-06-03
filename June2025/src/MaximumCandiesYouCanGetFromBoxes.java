import java.util.*;
/*
time complexity: O(n+e)
space complexity: O(n)
 */
public class MaximumCandiesYouCanGetFromBoxes {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int candiescollect=0;
        Set<Integer>vis=new HashSet<>();
        Set<Integer>foundboxes=new HashSet<>();
        for(int box:initialBoxes){
            candiescollect+=dfs(box,status,candies,keys,containedBoxes,vis,foundboxes);
        }
        return candiescollect;
    }
    public int dfs(int box,int[] status,int[] candies,int[][]keys,int containedboxes[][],
                   Set<Integer>vis,Set<Integer>foundboxes){
        if(vis.contains(box)){
            return 0;
        }
        if(status[box]==0){
            foundboxes.add(box);
            return 0;
        }
        vis.add(box);
        int candiescollect=candies[box];
        for(int innerbox:containedboxes[box]){
            candiescollect+=dfs(innerbox,status,candies,keys,containedboxes,vis,foundboxes);
        }
        for(int boxkey:keys[box]){
            status[boxkey]=1;
            if(foundboxes.contains(boxkey)){
                candiescollect+=dfs(boxkey,status,candies,keys,containedboxes,vis,foundboxes);
            }
        }
        return candiescollect;
    }
}

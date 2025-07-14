import java.util.*;
/*
time complexity: O(nlogn)+O(mlogm)
space complexity: O(1)
 */


public class Leetcode2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m){
            if(players[i]<=trainers[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}

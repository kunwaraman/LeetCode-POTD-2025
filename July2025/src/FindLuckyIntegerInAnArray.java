/*
time complexity: O(n)
space complexity: O(n)
 */
import java.util.*;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int maxm=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            int ky=entry.getKey();
            if(val==ky){
                maxm=Math.max(maxm,ky);
            }
        }
        return maxm;
    }
}

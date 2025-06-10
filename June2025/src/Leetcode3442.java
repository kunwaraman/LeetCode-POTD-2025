/*
time complexity: O(n)
space complexity: O(n)
 */


import java.util.*;


public class Leetcode3442 {
    public int maxDifference(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxodd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val%2==0){
                mineven=Math.min(mineven,val);
            }else if(val%2!=0){
                maxodd=Math.max(maxodd,val);
            }
        }
        return maxodd-mineven;
    }
}

import java.util.*;
/*
time complexity : O(n)
space complexity: O(n)
 */
public class RabbitInJungle {
    public int numRabbits(int[] answers) {
        int n = answers.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:answers){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int total=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int ky=entry.getKey();
            int val=entry.getValue();
            int gs=ky+1;
            int gps=(int)Math.ceil((double)val/gs);
            total+=gs*gps;
        }
        return total;
    }
}

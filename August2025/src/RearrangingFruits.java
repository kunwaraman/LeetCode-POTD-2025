import java.util.*;
/*
time complexity: O(nlogn)
space complexity: O(n)
 */

public class RearrangingFruits {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int minele=Integer.MAX_VALUE;
        for(int val:basket1){
            map.put(val,map.getOrDefault(val,0)+1);
            minele=Math.min(minele,val);
        }
        for(int val:basket2){
            map.put(val,map.getOrDefault(val,0)-1);
            minele=Math.min(minele,val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int ky=entry.getKey();
            int val=entry.getValue();
            if(val==0){
                continue;
            }
            if(val%2!=0){
                return -1;
            }
            for(int i=1;i<=Math.abs(val)/2;i++){
                list.add(ky);
            }
        }
        Collections.sort(list);
        long res=0;
        for(int i=0;i<list.size()/2;i++){
            res+=Math.min(list.get(i),minele*2);
        }
        return res;

    }
}

import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class NumberOfEquivalentDominoePairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int domino[]:dominoes){
            int a=domino[0];
            int b=domino[1];
            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            String key=a + "," + b;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String ky=entry.getKey();
            int val=entry.getValue();
            count+=val*(val-1)/2;
        }
        return count;

    }
}

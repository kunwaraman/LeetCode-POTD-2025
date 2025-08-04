import java.util.*;
/*
time complexity: O(n)
space complexity: O(1)  // we only store map size ==2 only else if grater we remove
 */

public class FruitsInToBasket {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i=0;
        int j=0;
        int maxm=0;
        if(n==1){
            return 1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            if(map.size()<=2){
                maxm=Math.max(maxm,j-i+1);
            }
            if(map.size()>2){
                while(2<map.size()){
                    map.put(fruits[i],map.get(fruits[i])-1);
                    if(map.get(fruits[i])==0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return maxm;
    }
}

import java.util.*;
/*
time complexity: O(n)
space complexity: O(1)
 */

public class MinimumDeletionToMakeStringKSpecial {
    public int minimumDeletions(String word, int k) {
        int n = word.length();
        int res=word.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int a:map.values()){
            int delete=0;
            for(int b:map.values()){
                if(a>b){
                    delete+=b;
                }else if(b>a+k){
                    delete+=b-(a+k);
                }
            }
            res=Math.min(res,delete);
        }
        return res;
    }
}
}

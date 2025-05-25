import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class LongestPalindromicByConcatenatingTwoLetters {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        HashMap<String,Integer> map = new HashMap<>();
        int res=0;
        for(String word:words){
            String reverseword=new StringBuilder(word).reverse().toString();
            if(map.getOrDefault(reverseword,0)>0){
                res+=4;
                map.put(reverseword,map.get(reverseword)-1);
            }else{
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String word=entry.getKey();
            int val=entry.getValue();
            if(word.charAt(0)==word.charAt(1) && val>0){
                res+=2;
                break;
            }
        }
        return res;
    }
}

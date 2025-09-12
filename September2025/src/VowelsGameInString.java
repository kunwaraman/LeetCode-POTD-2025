import java.util.*;
/*
time complexity: O(n)
space complexity: O(1) we only add vowels so maxm vowels is a e i o u
 */

public class VowelsGameInString {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(isvowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val>0){
                return true;
            }
        }
        return false;
    }
    public boolean isvowel(char ch){
        return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}

import java.util.*;
/*
time complexity: O(n)
space complexity: O(1) becuae at the end worst case we only add 5 element only vowel so O(5) consider as O(1)
 */

public class SortVowelsInString {
    public String sortVowels(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(isvowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        String temp="AEIOUaeiou";
        int j=0;
        char res[] = s.toCharArray();
        for(int i=0;i<n;i++){
            if(isvowel(s.charAt(i))){
                while(map.getOrDefault(temp.charAt(j),0)==0){
                    j++;
                }
                res[i]=temp.charAt(j);
                map.put(temp.charAt(j),map.get(temp.charAt(j))-1);
            }
        }
        return new String(res);
    }
    public boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}

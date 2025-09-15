import java.util.*;
/*
time complexity: O(n + m)
space complexity: O(1) maxm 26 letter
 */

public class Leetcode1935 {
    public int canBeTypedWords(String text, String b) {
        int n = text.length();
        HashSet<Character> set = new HashSet<>();
        for(char ch:b.toCharArray()){
            set.add(ch);
        }
        int count=0;
        boolean cantype=true;
        for(int i=0;i<n;i++){
            if(text.charAt(i)==' '){
                if(cantype){
                    count++;
                }
                cantype=true;
            }else if(set.contains(text.charAt(i))){
                cantype=false;
            }
        }
        if(cantype){
            count++;
        }
        return count;
    }
}

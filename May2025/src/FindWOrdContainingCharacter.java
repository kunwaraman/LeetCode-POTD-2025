import java.util.*;
/*
time complexity: O(n*l) where n is the number of words and l is the length of each word
space complexity: O(n)
 */
public class FindWOrdContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String word = words[i];
            for(char ch:word.toCharArray()){
                if(ch==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}

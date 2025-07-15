/*
time complexity: O(n)
space complexity: O(1)
 */

public class ValidWord {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3){
            return false;
        }
        boolean hasvowel=false;
        boolean hasconsonant=false;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    hasvowel=true;
                }else{
                    hasconsonant=true;
                }
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return hasvowel && hasconsonant;
    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */

public class FindTheOriginalTypedStringI {
    public int possibleStringCount(String word) {
        int n = word.length();
        int count=0;
        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
            }
        }
        return count+1;
    }
}

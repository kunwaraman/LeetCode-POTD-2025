/*
time complexity: O(n^2)
space complexity: O(1)
 */
public class Leetcode3403 {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if(numFriends==1){
            return word;
        }
        int longest=n-(numFriends-1);
        String res="";
        for(int i=0;i<n;i++){
            int cantake=Math.min(longest,n-i);
            String sub=word.substring(i,i+cantake);
            if(sub.compareTo(res)>0){
                res=sub;
            }

        }
        return res;
    }
}

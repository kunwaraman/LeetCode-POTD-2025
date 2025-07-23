import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */

public class MaximumScoreAfterRemovingSubstring {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        String maxstr=(x>y) ? "ab" : "ba";
        String minstr;
        if(maxstr.equals("ab")){
            minstr="ba";
        }else{
            minstr="ab";
        }
        int score=0;
        String tfirst=removedsubs(s,maxstr);
        int count=(n-tfirst.length())/2;
        score+=count*Math.max(x,y);

        String tsecond=removedsubs(tfirst,minstr);
        count=(tfirst.length()-tsecond.length())/2;
        score+=count*Math.min(x,y);
        return score;
    }
    public String removedsubs(String s,String match){
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==match.charAt(1) && match.charAt(0)==stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

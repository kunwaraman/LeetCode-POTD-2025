import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class LeetCode2434 {
    public String robotWithString(String s) {
        int n = s.length();
        char minright[] = new char[n];
        minright[n-1]=s.charAt(n-1);
        for(int i=n-2;i>=0;i--){
            minright[i]=(char)Math.min(s.charAt(i),minright[i+1]);
        }
        StringBuilder sb = new StringBuilder();
        Deque<Character> deque = new LinkedList<>();
        int i=0;
        while(i<n){
            deque.push(s.charAt(i));
            char minchar = (i+1<n) ? minright[i+1] :s.charAt(i);
            while(!deque.isEmpty() && deque.peek()<=minchar){
                sb.append(deque.pop());
            }
            i++;
        }
        while(!deque.isEmpty()){
            sb.append(deque.pop());
        }
        return sb.toString();
    }
}

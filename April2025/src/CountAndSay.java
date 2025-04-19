/*
time complexity: O(n)
space complexity: O(n)
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String curr = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<curr.length();i++){
            int count=1;
            char ch=curr.charAt(i);
            while(i<curr.length()-1 && curr.charAt(i)==curr.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    }
}

/*
time complexity: O(n)
space complexity: O(1)  // maxm 3 size space will be considered so at it is constant
 */


public class Largest3SameNumberInString {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char maxchr=' ';
        for(int i=2;i<n;i++){
            if(i>=0 && num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
                maxchr=(char)Math.max(maxchr,num.charAt(i));
            }
        }
        if(maxchr==' '){
            return "";
        }
        return new String(new char[]{maxchr,maxchr,maxchr});
    }
}

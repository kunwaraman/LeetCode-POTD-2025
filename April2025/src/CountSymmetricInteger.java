/*
time complexity: O(n)
space complexity: O(1)
 */

public class CountSymmetricInteger {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            String s = Integer.toString(num);
            int n = s.length();
            if(n%2!=0){
                continue;
            }
            int lft=0;
            int rgt=0;
            for(int i=0;i<n/2;i++){
                lft+=s.charAt(i)-'0'; // covert string to integer
            }
            for(int i=n/2;i<n;i++){
                rgt+=s.charAt(i)-'0';
            }
            if(lft==rgt){
                count++;
            }

        }
        return count;
    }
}

import java.util.*;
/*
time complexity: O(1)
space complexity: O(1)
 */

public class ReorderedPowerOfTwo {
    public boolean reorderedPowerOf2(int n) {
        String s = getstr(n);
        for(int pow=0;pow<=29;pow++){
            int val=(int)Math.pow(2,pow);
            if(s.equals(getstr(val))){
                return true;
            }
        }
        return false;

    }
    public String getstr(int n){
        char arr[] = Integer.toString(n).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

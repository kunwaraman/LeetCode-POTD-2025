import java.util.*;
/*
time complexity: O(n^3)
space complexity: O(n)
 */

public class FindingTHreeDigitEvenNumber {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||i==k||j==k){
                        continue; // invalid case
                    }
                    int num=(digits[i]*100)+(digits[j]*10)+(digits[k]*1);
                    if(num>=100 && num%2==0){
                        set.add(num);
                    }
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int st:set){
            list.add(st);
        }
        Collections.sort(list);
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}

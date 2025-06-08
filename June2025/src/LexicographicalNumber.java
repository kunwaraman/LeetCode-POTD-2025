/*
time complexity: O(n)
space complexity: O(n)
 */
import java.util.*;

public class LexicographicalNumber {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int start=1;start<=9;start++){
            recur(start,n,list);
        }
        return list;
    }
    public void recur(int curr,int n,List<Integer> list){
        if(curr>n){
            return;
        }
        list.add(curr);
        for(int i=0;i<=9;i++){
            int newnum=(curr*10)+i;
            if(newnum>n){
                return;
            }
            recur(newnum,n,list);
        }
    }
}

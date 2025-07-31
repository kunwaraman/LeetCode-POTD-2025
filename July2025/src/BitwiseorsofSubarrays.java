import java.util.*;
/*
time complexity: O(n*32)
space complexity: O(n)

 */

public class BitwiseorsofSubarrays {
    public int subarrayBitwiseORs(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ct= new HashSet<>();
        HashSet<Integer> pt= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int x:pt){
                ct.add(arr[i]|x);
                set.add(arr[i]|x);
            }
            ct.add(arr[i]);
            set.add(arr[i]);
            pt=ct;
            ct=new HashSet<>();
        }
        return set.size();

    }
}

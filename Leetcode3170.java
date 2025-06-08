import java.util.*;
/*
time complexity: O(n log n)
space complexity: O(n)
 */

public class Leetcode3170 {
    public String clearStars(String s) {
        int n = s.length();
        List<Character> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(b[1],a[1]);
        });
        int index=0;
        for(char ch:s.toCharArray()){
            if(ch!='*'){
                list.add(ch);
                pq.add(new int[]{ch,index});
                index++;
            }else{
                if(!pq.isEmpty()){
                    int min[] = pq.remove();
                    int curridx=min[1];
                    list.set(curridx,null);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            Character ch=list.get(i);
            if(ch!=null){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

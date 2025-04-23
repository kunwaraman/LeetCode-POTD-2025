import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class CountLargestGroup {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxsize=0;
        int count=0;
        for(int num=1;num<=n;num++){
            int digit=digitsum(num);
            map.put(digit,map.getOrDefault(digit,0)+1);
            if(map.get(digit)==maxsize){
                count++;
            }else if(map.get(digit)>maxsize){
                maxsize=map.get(digit);
                count=1;
            }
        }
        return count;

    }
    public int digitsum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}

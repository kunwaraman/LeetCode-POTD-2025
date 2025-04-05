/*
time complexity : O(2^n)
space complexity: O(n)
 */
import java.util.*;
public class SumOfAllSubsetsXorTotal {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //  ArrayList<Integer> inside=new ArrayList<>();
        recur(nums,0,list,new ArrayList<>());
        int ans=0;
        for(List<Integer>inside:list){
            int subcount=0;
            for(int num:inside){
                subcount^=num;
            }
            ans+=subcount;
        }
        return ans;

    }
    public void recur(int nums[],int i,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> inside){
        int n = nums.length;
        if(i>=n){
            list.add(new ArrayList<>(inside));
            return;
        }
        inside.add(nums[i]);
        recur(nums,i+1,list,inside);
        inside.remove(inside.size()-1);
        recur(nums,i+1,list,inside);

    }
}

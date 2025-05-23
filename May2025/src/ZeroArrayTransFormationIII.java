
public class ZeroArrayTransFormationIII {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        Arrays.sort(queries,(a,b)->Integer.compare(a[0],b[0]));
        int j=0;
        int usedcount=0;
        for(int i=0;i<n;i++){
            while(j<q && queries[j][0]==i){
                maxheap.add(queries[j][1]);
                j++;
            }
            // first we check can we impact
            nums[i]=nums[i]-minheap.size();
            while(nums[i]>0 && !maxheap.isEmpty() && maxheap.peek()>=i){
                int ending=maxheap.remove();
                minheap.add(ending);
                usedcount++;
                nums[i]--;
            }
            if(nums[i]>0){
                return -1;
            }
            // clear out past indices;
            while(!minheap.isEmpty() && minheap.peek()<=i){
                minheap.remove();
            }
        }
        return q-usedcount;

    }
}

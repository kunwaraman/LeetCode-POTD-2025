import java.util.*;
/*
time complexity: O((N+M)∗26)
space complexity: O(N∗26+M)
 */

public class LargestColorValueInDIrectedGraph {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for(int edge[]:edges){
            int u= edge[0];
            int v= edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        int dp[][] = new int[n][26];
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
                dp[i][colors.charAt(i)-'a']=1;
            }
        }
        int ans=0;
        int count=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int curr = queue.remove();
                count++;
                ans=Math.max(ans,dp[curr][colors.charAt(curr)-'a']);
                for(int v:adj.get(curr)){
                    for(int c=0;c<26;c++){
                        dp[v][c] = Math.max(dp[v][c], dp[curr][c] + ((colors.charAt(v) - 'a') == c ? 1 : 0));
                    }
                    indegree[v]--;
                    if(indegree[v]==0){
                        queue.add(v);
                    }
                }
            }
        }
        if(count<n){
            return -1;
        }
        return ans;

    }
}

import java.util.*;
/*
time complexity:
 */
public class MaximizeTheNumberOfTargetNodesAfterConnectingTrees {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length+1;
        int res1[] = findcount(edges1,k);
        int res2[] = findcount(edges2,k-1);
        int maxtarget=Arrays.stream(res2).max().getAsInt();
        for(int i=0;i<res1.length;i++){
            res1[i]+=maxtarget;
        }
        return res1;

    }
    public int[] findcount(int edges[][],int k){
        int n = edges.length+1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int ans[] = new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i]=bfs(i,adj,k);
        }
        return ans;
    }
    public int bfs(int src,ArrayList<ArrayList<Integer>> adj ,int k){
        int n = adj.size();
        Queue<int[]> queue = new LinkedList<>();
        boolean vis[] = new boolean[n];
        queue.add(new int[]{src,0});
        vis[src]=true;
        int count=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int curr[] = queue.remove();
                int currnode=curr[0];
                int dist=curr[1];
                if(dist>k){
                    continue;
                }
                count++; // one node we visit
                for(int v:adj.get(currnode)){
                    if(vis[v]==false){
                        vis[v]=true;
                        queue.add(new int[]{v,dist+1});
                    }
                }
            }
        }
        return count;
    }
}

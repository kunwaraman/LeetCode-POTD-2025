import java.util.*;
/*
time complexity: O(m)*O(V+E);
space complexity: O(V+E);
 */
public class LexicographicallySmallestEquivalentString {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n= s1.length();
        ArrayList<ArrayList<Character>> adj = new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<s1.length();i++){
            char u=s1.charAt(i);
            char v=s2.charAt(i);
            adj.get(u-'a').add(v);
            adj.get(v-'a').add(u);
        }
        StringBuilder sb = new StringBuilder();
        int m = baseStr.length();
        for(int i=0;i<m;i++){
            char ch=baseStr.charAt(i);
            boolean vis[] = new boolean[26];
            sb.append(dfs(adj,ch,vis));
        }
        return sb.toString();

    }
    public char dfs(ArrayList<ArrayList<Character>>adj,char src,boolean vis[]){
        vis[src-'a']=true;
        char minmchar=src;
        for(char v:adj.get(src-'a')){
            if(vis[v-'a']==false){
                char nextmin=dfs(adj,v,vis);
                if(nextmin<minmchar){
                    minmchar=nextmin;
                }
            }
        }
        return minmchar;
    }
}

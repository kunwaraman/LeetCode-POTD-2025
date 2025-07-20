import java.util.*;
/*
time complexity: O(nlogn)
space complexity: O(n)
 */


public class RemoveSubFolderFromTHeFIleSystem {
    public List<String> removeSubfolders(String[] folder) {
        int n = folder.length;
        Arrays.sort(folder);
        ArrayList<String> list = new ArrayList<>();
        list.add(folder[0]);
        for(int i=1;i<n;i++){
            String curr = folder[i];
            String prev = list.get(list.size()-1);
            prev+="/";
            if(!curr.startsWith(prev)){
                list.add(curr);
            }
        }
        return list;

    }
}

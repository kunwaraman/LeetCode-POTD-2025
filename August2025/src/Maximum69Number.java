/*
time complexity: O(n)
space complexity: O(1)
 */

public class Maximum69Number {
    public int maximum69Number (int num) {
        char arr[] = String.valueOf(num).toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}

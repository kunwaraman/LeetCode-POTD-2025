/*
time complexity: O(n+t)
space complexity: O(1)
 */
public class TotalCharacterOfStringAfterTransformationI {
    int M=1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int n = s.length();
        int freq[] = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int count=0;count<t;count++){
            int temp[] = new int[26];
            for(int i=0;i<26;i++){
                char ch=(char)(i+'a');
                int val=freq[i];

                if(ch!='z'){
                    temp[(ch + 1) - 'a'] = (temp[(ch + 1) - 'a'] + val) % M;
                }else{
                    temp['a'-'a']=(temp['a'-'a']+val)%M;
                    temp['b'-'a']=(temp['b'-'a']+val)%M;
                }
            }
            freq=temp;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans=(ans+freq[i])%M;
        }
        return ans;

    }
}

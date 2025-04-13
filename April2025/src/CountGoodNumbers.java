/*
time complexity: O(logn)
space complexity: O(1)
 */
public class CountGoodNumbers {
    long M = 1000000007;
    public int countGoodNumbers(long n) {
        return (int)((find(5,(n+1)/2)*find(4,n/2))%M);
    }
    public long find(long a,long b){
        if(b==0){
            return 1;
        }
        long half=find(a,b/2);
        long res=(half*half)%M;
        if(b%2==1){
            res=(res*a)%M;
        }
        return res;
    }
}

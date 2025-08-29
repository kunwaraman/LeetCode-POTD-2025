/*
time complexity: O(1)
space complexity: O(1)
 */

public class ALiceAndBobPlayingFlowerGame {
    public long flowerGame(int n, int m) {
        long oddn=(n+1)/2;
        long evenn=n/2;
        long oddm=(m+1)/2;
        long evenm=m/2;
        return (oddn*evenm)+(oddm*evenn);

    }
}

/*
time complexity: O(n)
space complexity: O(1)
 */
public class DistributeCandiesAmongChildrenii {
    public long distributeCandies(int n, int limit) {
        long ways = 0;
        int minCh1 = Math.max(0, n - 2 * limit);
        int maxCh1 = Math.min(n, limit);
        for (int i = minCh1; i <= maxCh1; i++) {
            int remaining = n - i;
            int minCh2 = Math.max(0, remaining - limit);
            int maxCh2 = Math.min(remaining, limit);
            ways += (maxCh2 - minCh2 + 1);
        }
        return ways;
    }
}

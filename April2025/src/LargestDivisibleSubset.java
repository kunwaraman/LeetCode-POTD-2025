import java.util.*;
/*
time complexity: O(n^2)
space complexity: O(n)
 */

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        while (maxIndex != -1) {
            list.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        Collections.reverse(list);
        return list;
    }
}

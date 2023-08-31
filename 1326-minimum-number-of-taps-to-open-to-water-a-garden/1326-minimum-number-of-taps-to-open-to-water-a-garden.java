class Solution {
public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+2);
        dp[0] = 0;
        for(int i=0;i<=n;i++) {
                int min = Math.max(0,i-ranges[i]);
                int max = Math.min(n,i+ranges[i]);
        for(int j=min+1;j<=max;j++) {
                dp[j] = Math.min(dp[j],dp[min]+1);
        }
        }
        return dp[n] == n+2 ? -1 : dp[n];
        }
}

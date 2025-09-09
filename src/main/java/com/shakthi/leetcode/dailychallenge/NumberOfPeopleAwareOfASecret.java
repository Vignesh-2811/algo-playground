package com.shakthi.leetcode.dailychallenge;

public class NumberOfPeopleAwareOfASecret {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final long MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        dp[1] = 1;

        for (int day = 1; day <= n; day++) {
            long sharers = dp[day];
            if (sharers == 0) continue;

            for (int j = day + delay; j < day + forget && j <= n; j++) {
                dp[j] = (dp[j] + sharers) % MOD;
            }

        }

        long ans = 0;

        for (int i = n - forget + 1; i <= n; i++) {
            ans = (ans + dp[i]) % MOD;
        }

        return (int) ans;
    }
}

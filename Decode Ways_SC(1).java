class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();
        int prev2 = 1; // dp[0] → empty string
        int prev1 = s.charAt(0) == '0' ? 0 : 1; // dp[1]

        for (int i = 2; i <= n; i++) {
            int curr = 0;

            int singleD = Integer.valueOf(s.substring(i - 1, i));
            int doubleD = Integer.valueOf(s.substring(i - 2, i));

            if (singleD >= 1) {
                curr += prev1;   // use dp[i-1]
            }
            if (doubleD >= 10 && doubleD <= 26) {
                curr += prev2;   // use dp[i-2]
            }

            // shift for next iteration
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

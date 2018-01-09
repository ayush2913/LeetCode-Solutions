//357. Count Numbers with Unique Digits
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n];
        int[] sum = new int[n];
        if(n==0) return 1;
        sum[0] = 10;
        dp[0] = 9;
        for(int i=1; i<n; i++){
            dp[i] = dp[i-1]*(10-i);
            sum[i] = dp[i]+sum[i-1];
        }
        return sum[n-1];
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        boolean[][] dp = new boolean[l1+1][l2+1];
        dp[l1][l2] = true;
        for(int i=0; i<l1; i++){
            dp[i][l2] = false;
        }

        for(int i=0; i<l2; i++){
            dp[l1][i] = true;
        }

        for(int i=l1-1; i>=0; i--){
            for(int j=l2-1; j>=0; j--){
                if(s.charAt(i) == t.charAt(j))
                    dp[i][j] = dp[i+1][j+1];
                else
                    dp[i][j] = dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}
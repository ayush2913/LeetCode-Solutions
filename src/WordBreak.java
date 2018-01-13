class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[len] = true;
        for(int i=s.length()-1; i>=0; i--){
            for(int j = 0; j<wordDict.size(); j++){
                if(wordDict.get(j).charAt(0) == s.charAt(i) && s.indexOf(wordDict.get(j), i) == i) dp[i]|=i+wordDict.get(j).length()<=len & dp[i+wordDict.get(j).length()];
            }
        }

        return dp[0];
    }
}
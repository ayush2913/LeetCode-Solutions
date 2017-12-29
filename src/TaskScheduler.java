class Solution {
    public int leastInterval(char[] tasks, int n) {
        int result=0;
        int[] res = new int[26];
        for(int i=0; i<tasks.length; i++){
            res[tasks[i] - 'A'] ++;
        }
        Arrays.sort(res);
        while(res[25]>0){
            int i = 0;
            while(i<=n){
                if(res[25]==0)
                    break;
                if(i<26 && res[25-i]>0)
                    res[25-i]--;
                result++;
                i++;
            }
            Arrays.sort(res);
        }
        return result;
    }
}
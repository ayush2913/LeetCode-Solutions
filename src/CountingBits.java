class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        if(num==0) return res;
        res[1] = 1;
        if(num==1) return res;
        for(int i=2; i<=num; i++){
            if(i%2 == 1){
                res[i] = res[i/2]+1;
            }else{
                res[i] = res[i/2];
            }
        }

        return res;

    }
}
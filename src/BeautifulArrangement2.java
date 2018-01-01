//Beautiful Arrangement II
class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        result[0]=1;
        int temp = k+2;
        for(int i=1; i<n; i++){
            if(k!=0){
                result[i]=result[i-1]+k;
                k = k>0?-k+1:-k-1;
            }else{
                result[i] = temp;
                temp++;
            }
        }
        return result;
    }
}
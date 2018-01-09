//413. Arithmetic Slices
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int[] diff = new int[A.length];
        for(int i=1; i<A.length; i++){
            diff[i] = A[i]-A[i-1];
        }
        int[] mem = new int[A.length];
        for(int i=2; i<A.length; i++){
            if(diff[i] == diff[i-1]) mem[i] = mem[i-1]+1;
            else mem[i]=0;
        }

        int res = 0;
        for(int i=0; i<mem.length; i++)
            res = res+mem[i];

        return res;


    }
}
//526. Beautiful Arrangement
class Solution {
    int result;
    public int countArrangement(int N) {
        result = 0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        bactrackArrangment(arr,0);
        return result;
    }

    public void bactrackArrangment(int[] arr, int start){
        if(start == arr.length)
            result++;
        else{
            for(int i=start; i<arr.length; i++){
                swap(arr, start, i);
                if(arr[start]%(start+1)==0 || (start+1)%arr[start] ==0)
                    bactrackArrangment(arr, start+1);
                swap(arr, start, i);
            }
        }
    }

    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
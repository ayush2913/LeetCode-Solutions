//435. Non-overlapping Intervals
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length == 0) return 0;
        Interval[] sorted = mergeSort(intervals, 0, intervals.length-1);
        int res = 0;
        int end = sorted[0].end;
        for(int i=1; i<sorted.length; i++){
            System.out.println(sorted[i].end);
            if(sorted[i].start<end) res++;
            else end = sorted[i].end;
        }
        return res;
    }

    public Interval[] mergeSort(Interval[] intervals, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            Interval[] left = mergeSort(intervals, start, mid);
            Interval[] right = mergeSort(intervals, mid+1, end);
            return merge(left,right);
        }else{
            Interval[] result = new Interval[1];
            result[0] = intervals[start];
            return result;
        }
    }
    public Interval[] merge(Interval[] left, Interval[] right){
        int l1 = left.length;
        int l2 = right.length;
        Interval[] result = new Interval[l1+l2];
        int i=0, j=0,k=0;
        while(i<l1 && j<l2){
            if(left[i].end > right[j].end){
                result[k] = right[j];
                j++;
            }else{
                result[k] = left[i];
                i++;
            }
            k++;
        }
        while(i<l1){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j<l2){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;

    }

}
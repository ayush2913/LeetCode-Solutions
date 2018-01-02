//56. Merge Intervals
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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size()==0) return result;
        List<Interval> sorted = mergeSort(intervals,0,intervals.size()-1);
        int k=-1;
        for(int i=0; i<intervals.size(); i++){

            if(result.isEmpty()||sorted.get(i).start>result.get(k).end){
                // System.out.println("first");
                // System.out.println(i);
                result.add(sorted.get(i));
                k++;
            }else{
                // System.out.println("third");
                result.get(k).end = Math.max(result.get(k).end, sorted.get(i).end);
            }
        }

        return result;
    }

    public List<Interval> mergeSort(List<Interval> intervals, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            List<Interval> left = mergeSort(intervals, start, mid);
            List<Interval> right = mergeSort(intervals, mid+1, end);
            return merge(left,right);
        }else{
            List<Interval> result = new ArrayList<Interval>();
            result.add(intervals.get(start));
            return result;
        }
    }
    public List<Interval> merge(List<Interval> left, List<Interval> right){
        int l1 = left.size();
        int l2 = right.size();
        List<Interval> result = new ArrayList<Interval>();
        int i=0, j=0,k=0;
        while(i<l1 && j<l2){
            if(left.get(i).start > right.get(j).start){
                result.add(right.get(j));
                j++;
            }else{
                result.add(left.get(i));
                i++;
            }
        }
        while(i<l1){
            result.add(left.get(i));
            i++;
        }
        while(j<l2){
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}
//729. My Calendar I
class MyCalendar {

    List<Integer> fullRange;

    public MyCalendar() {
        fullRange = new ArrayList<Integer>();
    }

    public boolean book(int start, int end) {
        for(int i=0; i<fullRange.size()-1; i+=2){
            if(fullRange.get(i+1)<start){continue;}
            else if(fullRange.get(i)<=start && start<fullRange.get(i+1)) return false;
            else if(fullRange.get(i)>=start&&fullRange.get(i)<end) return false;
            else{
                if(fullRange.get(i)>start&&fullRange.get(i)>=end){
                    fullRange.add(i,start);
                    fullRange.add(i+1,end);
                    return true;
                }
            }
        }

        fullRange.add(start);
        fullRange.add(end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
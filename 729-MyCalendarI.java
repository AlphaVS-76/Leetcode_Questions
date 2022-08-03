//Question Link - https://leetcode.com/problems/my-calendar-i/

class MyCalendar {
    List<int[]> cal;
    
    public MyCalendar() {
        cal = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        //check if the new event is in between amy events or not
        for (int[] d: cal) {
            if (d[0] < end && start < d[1]) {
                return false;
            }
        }
        
        //if the list is sorted, it gets added
        cal.add(new int[]{start, end});
        
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

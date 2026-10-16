/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> inter) {
     inter.sort((a, b) -> Integer.compare(a.start, b.start));
     int i=-999;
     for(Interval a:inter){
        if(a.start<i){
            return false;
        }
        i=a.end;
     }
     
     return true;

    }
}

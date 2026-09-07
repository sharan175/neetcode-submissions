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
    inter.sort((a,b)->Integer.compare(a.start,b.start));
    for(int i=0;i<inter.size()-1;i++){
        Interval prev=inter.get(i);
        Interval nex=inter.get(i+1);
         if(prev.end>nex.start){
            return false;
         }
    }
     return true;
    }
}

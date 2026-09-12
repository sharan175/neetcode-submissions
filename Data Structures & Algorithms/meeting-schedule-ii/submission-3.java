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
    public int minMeetingRooms(List<Interval> inter) {
        inter.sort((a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(Interval a:inter){
           if(!q.isEmpty() && q.peek()<=a.start){
            q.poll();
           }
           q.offer(a.end);
        }
        return q.size();
    }
}

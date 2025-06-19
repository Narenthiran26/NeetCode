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
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b)-> Integer.compare(a.start,b.start));
        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(Interval meet:intervals){
            if(!p.isEmpty() && meet.start>=p.peek()){
                p.poll();
            }
            p.offer(meet.end);
        }
    return p.size();
    }
}

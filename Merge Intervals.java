class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        List<int[]> merged=new ArrayList<>();

        int[] current=intervals[0];
        merged.add(current);

        for(int[] interval:intervals){
            int currentEnd=current[1];
            int nextStart=interval[0];
            int nextEnd=interval[1];

            if(nextStart<=currentEnd){
                current[1]=Math.max(currentEnd,nextEnd);
            }
            else{
                current=interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        List<int[]> m=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int a[]=intervals[i];
            if(m.isEmpty() ){
                m.add(a);
            }
            else if(m.get(0)[1]>a[0]){
                count++;
            }
            else{
                m=new ArrayList<>();
                m.add(a);
            }
        }
        return count;
    }
}

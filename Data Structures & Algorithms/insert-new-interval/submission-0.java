class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     List<int[]> k=new ArrayList<>();
     List<int[]> m=new ArrayList<>();
     k.add(newInterval);
     for(int i=0;i<intervals.length;i++){
        int a[]=intervals[i];
        if(a[1]<k.get(0)[0]){
         m.add(a);         
        }
        else if(k.get(0)[1]<a[0]){
         int c[]=k.get(0);
         m.add(c);
         k=new ArrayList<>();
         k.add(a);
        }
        else{
            int x=Math.min(k.get(0)[0],a[0]);
            int y=Math.max(k.get(0)[1],a[1]);
            int c[]=new int[2];
            c[0]=x;
            c[1]=y;
            k=new ArrayList<>();
            k.add(c);
        }
     }
     m.add(k.get(0));
     return m.toArray(new int[m.size()-1][]);
    }
}

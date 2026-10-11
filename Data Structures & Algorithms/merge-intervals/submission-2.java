class Solution {
    public int[][] merge(int[][] t) {
      Arrays.sort(t,(a,b)->a[0]-b[0]);
      List<int[]> l=new ArrayList<>();
      int a[]=new int[2];
      a[0]=t[0][0];
      a[1]=t[0][1];
      l.add(a);
      for(int k[]:t){
        if(a[1]>=k[0]){
           a[0]=Math.min(a[0],k[0]);
           a[1]=Math.max(a[1],k[1]);
        }
        else{
            a=new int[2];
            a[0]=k[0];
            a[1]=k[1];
            l.add(a);
        }
      }
       return l.toArray(new int[0][]);
    }
}

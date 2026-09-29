class Solution {
    public int carFleet(int target, int[] p, int[] s) {
       Integer[] idx=new Integer[p.length];
       for(int i=0;i<p.length;i++){
        idx[i]=i;
       }
       Arrays.sort(idx,(a,b)-> p[b]-p[a]);
       int fleet=0;
       double time=0;
    for(int i:idx){
        double a=(double) (target-p[i])/s[i];
         if(a>time){
          fleet++;
          time=a;
         }
    }
    return fleet;
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x==0) return  0;
     int l=1;
     int r=x;
     while(l<=r){
      int m = l + (r - l) / 2;
      Long s=(long) m*m;
      if((s)>x){
        r=m-1;
      }
      else if(s<x){
        l=m+1; 
      }
      else{
        return m;
      }
     }
     return r;
    }
}
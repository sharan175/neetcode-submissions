class Solution {
    public int reverseBits(int n) {
      int x=0;
      int count=0;
      while(count!=32){
        int a=n&1;
        n=n>>1;
        x=x<<1;
        x=x|a;
        count++;
      } 
      return x; 
    }
}

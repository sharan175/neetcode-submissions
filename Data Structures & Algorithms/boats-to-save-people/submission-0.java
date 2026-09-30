class Solution {
    public int numRescueBoats(int[] p, int l) {
       Arrays.sort(p);
       int c=0;
       int i=0;
       int j=p.length-1;
       while(i<=j){
        int s=l;
        s-=p[j];
        if(s-p[i]>=0){
            i++;
        }
       c++;
       j--;
       }
       return c;
    }
}
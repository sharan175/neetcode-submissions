class Solution {
    public int maxProfit(int[] p) {
        int max=0;
        for(int i=1;i<p.length;i++){
            if(p[i-1]<p[i]){
                max+=p[i]-p[i-1];
            }
        }
        return max;
    }
}
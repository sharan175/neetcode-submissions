class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int s=0;
        int l=heights.length-1;
        while(s<l){
            int h=Math.min(heights[s],heights[l]);
            max=Math.max(max,h*(l-s));
            if(heights[s]<heights[l]){
                s++;
            }
            else{
                l--;
            }
        }
        return max;
    }
}
